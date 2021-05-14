package br.edu.infnet.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.edu.infnet.database.configuration.AppDatabase
import br.edu.infnet.database.entity.Note
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = AppDatabase.getInstance(applicationContext)

        db.noteDAO().store(
            Note(
                null,
               "cuco"
            )
        )

        Log.i("Note", db.noteDAO().findAll().size.toString())
    }
}