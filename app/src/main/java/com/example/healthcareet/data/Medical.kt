package com.example.healthcareet.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "medicals")
data class Medical (@PrimaryKey @ColumnInfo(name = "first_name") val first:String,
                    @ColumnInfo(name = "last_name") val last:String,
                    @ColumnInfo(name = "age") val age: String,
                    @ColumnInfo(name = "sex") val sex:String,
                    @ColumnInfo(name = "hospital") val hospital:String,
                    @ColumnInfo(name = "doctor") val doctor:String,
                    @ColumnInfo(name= "card") val card:Int,
                    @ColumnInfo(name = "check") val check:String,
                    @ColumnInfo(name = "history") val history:String
): Serializable

