package com.example.healthcare.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.healthcareet.data.Medical

@Dao
interface MedicalDao {

    @Query("SELECT * from medicals ORDER BY first_name")
    fun getAllMedicals(): LiveData<List<Medical>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMedical(medical: Medical):Long


    @Delete
    fun deleteMedical(medical: Medical):Int

    @Update
    fun updateMedical(medical: Medical):Int


}

