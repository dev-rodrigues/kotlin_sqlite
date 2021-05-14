package br.edu.infnet.database.configuration

import android.content.Context
import androidx.room.*
import br.edu.infnet.database.dao.NoteDAO
import br.edu.infnet.database.entity.Note

@Database(
    entities = [
        Note::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDAO(): NoteDAO

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase ?= null

        fun getInstance(context: Context):AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "appDatabase.bd"
                )
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE!!
        }

    }
}