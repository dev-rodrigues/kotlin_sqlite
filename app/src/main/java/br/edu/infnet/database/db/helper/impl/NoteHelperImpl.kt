package br.edu.infnet.database.db.helper.impl

import br.edu.infnet.database.configuration.AppDatabase
import br.edu.infnet.database.entity.Note
import br.edu.infnet.database.db.helper.NoteHelper

class NoteHelperImpl(private val appDatabase: AppDatabase): NoteHelper {
    override fun getNotes(): List<Note> {
        return appDatabase.noteDAO().findAll();
    }
}