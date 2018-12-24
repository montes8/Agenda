package com.example.tayler_gabbi.agenda

import android.app.Application
import android.arch.persistence.room.Room
import com.example.tayler_gabbi.agenda.database.DataBaseAgenda

class ScheduleApplication : Application(){

    companion object {
        var database : DataBaseAgenda? = null
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this,DataBaseAgenda::class.java,"db_schedule").build()
    }
}