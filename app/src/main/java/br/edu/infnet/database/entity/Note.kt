package br.edu.infnet.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Note {

    @PrimaryKey(autoGenerate = true)
    var id: Int ?= null

    var description: String ?= null

    constructor(id: Int? = null, description: String) {
        this.id = id
        this.description = description
    }
}