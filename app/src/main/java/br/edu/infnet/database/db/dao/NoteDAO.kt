package br.edu.infnet.database.db.daoInsert

import androidx.room.*
import br.edu.infnet.database.entity.Note

@Dao
interface NoteDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun store(note: Note)

    @Delete
    fun destroy(note: Note)

    @Query("SELECT *FROM note")
    fun findAll(): List<Note>

    @Query("SELECT *FROM note WHERE id = :id")
    fun findBy(id: Int):Note
}