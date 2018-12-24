package com.example.tayler_gabbi.agenda

import android.app.Application
import android.arch.persistence.room.Room
import com.example.tayler_gabbi.agenda.database.DataBase

class ScheduleApplication : Application(){

    companion object {
        var database : DataBase? = null
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this,DataBase::class.java,"db_schedule").build()
    }
}