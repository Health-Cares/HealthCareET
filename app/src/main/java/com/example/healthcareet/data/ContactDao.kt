package com.example.healthcare.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.healthcareet.data.Contact
import com.example.healthcareet.data.Medical

@Dao
interface ContactDao {

    @Query("SELECT * from contact ORDER BY id")
    fun getAllContact(): LiveData<List<Contact>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContact(contact: Contact):Long


    @Delete
    fun deleteContact(contact: Contact):Int

    @Update
    fun updateContact(contact: Contact):Int


}

