package com.example.healthcareet.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.healthcareet.data.Medical
import com.example.healthcare.data.MedicalDatabase
import com.example.healthcareet.repository.MedicalRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MedicalViewModel(application: Application): AndroidViewModel(application) {

    private val medicalRepository: MedicalRepository

    val allMedical: LiveData<List<Medical>>

    init {
        val medicalDao = MedicalDatabase.getDatabase(application).medicalDao()
        medicalRepository = MedicalRepository(medicalDao)
        allMedical = medicalRepository.allMedical()
    }

    fun insertMedical(medical: Medical) = viewModelScope.launch(Dispatchers.IO) {
        medicalRepository.insertMedical(medical)
    }
}


