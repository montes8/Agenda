package com.example.tayler_gabbi.agenda.database.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Usuario (
        @PrimaryKey(autoGenerate = true)
        var idUsu : Long? = null,

        var user : String = "",
        var name : String = "",
        var lastName :String = "",
        var mobile : String = "",
        var password : String = "",
        var birthdate : String = "",
        var email : String = "",
        var address : String = "",
        var country : String = "",
        //var photo : String = "",
        var stydyCenter : String = "",
        var description : String = ""






)