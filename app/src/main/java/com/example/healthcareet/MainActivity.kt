package com.example.healthcareet

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.healthcareet.data.Medical
import com.example.healthcareet.databinding.ActivityMainBinding
import com.example.healthcareet.viewmodel.MedicalViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_add_medical.*


const val NEW_MEDICAL_ACTIVITY_REQUEST_CODE = 1

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding
    lateinit var medicalViewModel: MedicalViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val navController = this.findNavController(R.id.homeFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)




    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == NEW_MEDICAL_ACTIVITY_REQUEST_CODE &&
            resultCode == Activity.RESULT_OK
        ) {
            val medical: Medical = data?.getSerializableExtra("MEDICAL") as Medical
            medicalViewModel.insertMedical(medical)

            val medicalD:Medical = data.getSerializableExtra("MEDICAL") as Medical
            medicalViewModel.deleteMedical(medicalD)

            val medicalU:Medical = data.getSerializableExtra("MEDICAL") as Medical
            medicalViewModel.updateMedical(medicalU)

        }

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.homeFragment)
        return navController.navigateUp()
    }

}



