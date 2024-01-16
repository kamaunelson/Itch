package com.example.itch.feature_note.domain.repository

import com.example.itch.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow


//used to test our application
//fake version of our repository
//remember in our repository is where it is decided where data is gotten from

//important to note that repository is used to access our data sources directly
//used to determine whether data source either api or database to be forward
//to the use cases and check if errors have occurred
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}