package com.example.androidmaps.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Place(

    @ColumnInfo(name = "name")
    var name : String,

    @ColumnInfo(name = "langitude")
    var langitude : Double,

    @ColumnInfo(name  = "longitude")
    var longitude : Double
) {

    @PrimaryKey(autoGenerate = true)
    var id = 0

}