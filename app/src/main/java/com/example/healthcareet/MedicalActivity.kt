package com.example.healthcareet

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.healthcareet.data.Medical
import com.example.healthcareet.viewmodel.MedicalViewModel
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.fragment_add_medical.*

class MedicalActivity: AppCompatActivity(){


    lateinit var medicalViewModel: MedicalViewModel

    private lateinit var saveButton: Button
    private lateinit var deleteButton: Button
    private lateinit var updateButton:Button

    private lateinit var first:TextInputEditText
    private lateinit var last:TextInputEditText
    private lateinit var age:TextInputEditText
    private lateinit var sex:TextInputEditText
    private lateinit var hospital:TextInputEditText
    private lateinit var doctor:TextInputEditText
    private lateinit var card:TextInputEditText
    private lateinit var check:TextInputEditText
    private lateinit var history:TextInputEditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_add_medical)



        saveButton = save_button
        deleteButton = delete_button
        updateButton = update_button

        first = firstN
        last = lastN
        age = ageN
        sex = sexT
        hospital = hospitalN
        doctor = doctorN
        card = cardN
        check  =checkD
        history = historyS




        saveButton.setOnClickListener {

            val medical = readFields()
            val replyMedicalIntent = Intent()
            replyMedicalIntent.putExtra("MEDICAL", medical)
            setResult(Activity.RESULT_OK, replyMedicalIntent)
            finish()

        }
        deleteButton.setOnClickListener {

            val medical = readFields()
            medicalViewModel.deleteMedical(medical)
        }


        updateButton.setOnClickListener {
            val medical = readFields()
            medicalViewModel.updateMedical(medical)
        }

    }


    private fun readFields() = Medical(
        first.text.toString(),
        last.text.toString(),
        age.text.toString(),
        sex.text.toString(),
        hospital.text.toString(),
        doctor.text.toString(),
        card.text.toString().toInt(),
        check.text.toString(),
        history.text.toString()
    )

}