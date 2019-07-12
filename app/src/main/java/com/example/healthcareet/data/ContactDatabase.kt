package com.example.healthcare.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.healthcareet.data.Medical

@Database(entities = arrayOf(Medical::class), version = 1)
abstract class ContactDatabase: RoomDatabase() {

    abstract fun cotactDao():ContactDao

    companion object {

        @Volatile
        private var INSTANCE: ContactDatabase? = null

        fun getDatabase(context: Context): ContactDatabase {

            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ContactDatabase::class.java, "contact_database"
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }
}


