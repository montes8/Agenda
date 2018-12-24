package com.example.tayler_gabbi.agenda.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.tayler_gabbi.agenda.database.dao.UsuarioDao
import com.example.tayler_gabbi.agenda.database.model.Usuario

@Database(entities = [Usuario::class],version = 1)
abstract class DataBaseAgenda : RoomDatabase() {

    abstract fun usuarioDao() : UsuarioDao
}