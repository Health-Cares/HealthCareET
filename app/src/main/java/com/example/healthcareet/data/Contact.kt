package com.example.healthcareet.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "contact")
data class Contact (@PrimaryKey @ColumnInfo(name = "id") val id:Int,
                    @ColumnInfo(name = "email") val last:String,
                    @ColumnInfo(name = "message") val message: String

): Serializable

