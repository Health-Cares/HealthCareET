package com.example.healthcareet

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.healthcareet.data.Medical
import com.example.healthcareet.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.fragment_add_medical.*


class MainActivity : AppCompatActivity(){

   // private lateinit var saveButton: Button
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val navController = this.findNavController(R.id.homeFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)


//         saveButton = save_button
//
//        saveButton.setOnClickListener {
//            val medical = readFields()
//            val replyMedicalIntent = Intent()
//            replyMedicalIntent.putExtra("MEDICAL", medical)
//            setResult(Activity.RESULT_OK, replyMedicalIntent)
//            finish()
//            clearFields()
//        }

    }

//    private fun readFields() = Medical(
//        firstN_editText.text.toString(),
//        lastN_editText.text.toString(),
//        hospital_editText.text.toString(),
//        doctorN_editText.text.toString(),
//        cardN_editText.text.toString().toInt(),
//        check_editText.text.toString()
//    )
//    private fun clearFields() {
//        firstN_editText.setText("")
//        lastN_editText.setText("")
//        hospital_editText.setText("")
//        doctorN_editText.setText("")
//        cardN_editText.text.toString().toInt()
//        check_editText.setText("")
//
//    }
//    private fun updateFields(medical: Medical){
//
//        medical.run{
//            firstN_editText.setText(fname)
//            lastN_editText.setText(lname)
//            hospital_editText.setText(hospital)
//            doctorN_editText.setText(doctor)
//            cardN_editText.setText(card.toString())
//            check_editText.setText(check)
//
//        }
    //}
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.homeFragment)
        return navController.navigateUp()
    }

}



