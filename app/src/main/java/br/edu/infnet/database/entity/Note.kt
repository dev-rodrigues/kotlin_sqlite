package br.edu.infnet.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (@PrimaryKey(autoGenerate = true)var id: Int ?= null, var description: String ?= null)