package com.example.healthcareet.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.healthcare.data.ContactDatabase
import com.example.healthcareet.data.Medical
import com.example.healthcare.data.MedicalDatabase
import com.example.healthcareet.data.Contact
import com.example.healthcareet.repository.ContactRepository
import com.example.healthcareet.repository.MedicalRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ContactViewModel(application: Application): AndroidViewModel(application) {

    private val contactRepository: ContactRepository

    val allContact: LiveData<List<Contact>>

    init {
        val contactDao = ContactDatabase.getDatabase(application).cotactDao()
        contactRepository = ContactRepository(contactDao)
        allContact = contactRepository.allContact()
    }

    fun insertContact(contact: Contact) = viewModelScope.launch(Dispatchers.IO) {
        contactRepository.insertContact(contact)
    }
    fun deleteContact(contact: Contact) = viewModelScope.launch (Dispatchers.IO){

        contactRepository.deleteContact(contact)
    }
    fun updateContact(contact: Contact) = viewModelScope.launch (Dispatchers.IO){
        contactRepository.updateContact(contact)
    }
}


