package com.example.itch.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.itch.feature_note.domain.model.Note

//this is our database which includes the entity class
// the notedatabase inherits the roomdatabase
//abstract notedao which everything is done.
@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao
}