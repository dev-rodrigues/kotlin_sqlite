package br.edu.infnet.database.db.helper

import br.edu.infnet.database.entity.Note

interface NoteHelper {
    fun getNotes(): List<Note>
}