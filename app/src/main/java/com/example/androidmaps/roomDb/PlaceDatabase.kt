package com.example.androidmaps.roomDb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidmaps.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao(): PLaceDao
}