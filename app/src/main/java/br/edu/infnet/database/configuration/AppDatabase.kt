package br.edu.infnet.database.configuration

import androidx.room.Database
import androidx.room.RoomDatabase
import br.edu.infnet.database.db.daoInsert.NoteDAO
import br.edu.infnet.database.entity.Note

@Database(
    entities = [
        Note::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDAO(): NoteDAO
}