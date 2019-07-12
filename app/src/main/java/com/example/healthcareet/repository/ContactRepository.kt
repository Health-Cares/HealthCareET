package com.example.healthcareet.repository

import androidx.lifecycle.LiveData
import com.example.healthcare.data.ContactDao
import com.example.healthcareet.data.Medical
import com.example.healthcare.data.MedicalDao
import com.example.healthcareet.data.Contact


class ContactRepository(private val contactDao: ContactDao) {

    fun allContact(): LiveData<List<Contact>> = contactDao.getAllContact()

    fun insertContact(contact: Contact) {
        contactDao.insertContact(contact)
    }
    fun updateContact(contact: Contact){
        contactDao.updateContact(contact)
    }
    fun deleteContact(contact: Contact){
        contactDao.deleteContact(contact)
    }
}


