package com.example.androidmaps.roomDb

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.androidmaps.model.Place
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

interface PLaceDao {

    @Query("SELECT * FROM Place")
    fun getAll() : Flowable<List<Place>>

    @Insert
    fun insert(place : Place) : Completable

    @Delete
    fun delete(place : Place) : Completable
}