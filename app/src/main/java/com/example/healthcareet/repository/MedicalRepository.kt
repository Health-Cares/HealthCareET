package com.example.healthcareet.repository

import androidx.lifecycle.LiveData
import com.example.healthcareet.data.Medical
import com.example.healthcare.data.MedicalDao


class MedicalRepository(private val medicalDao: MedicalDao) {

    fun allMedical(): LiveData<List<Medical>> = medicalDao.getAllMedicals()

    fun insertMedical(medical: Medical) {
        medicalDao.insertMedicals(medical)
    }
}


