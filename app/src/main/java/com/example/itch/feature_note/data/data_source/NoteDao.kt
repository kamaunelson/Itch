package com.example.itch.feature_note.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.itch.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    //Data access object
    //in this interface we declare functions used to access our object in terms of insert, delete or update
    //here we will also have the list of notes written
    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    // function to get note by id to load it
    //we use suspend because it may take time
    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    //insert and update because we use onclick a note
    //This function inserts a Note into the database.
    //If there's a conflict (i.e., a note with the same primary key already exists), it replaces the existing note with the new one.
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleNote(note: Note)
}