package com.example.itch.feature_note.data.repository

import com.example.itch.feature_note.data.data_source.NoteDao
import com.example.itch.feature_note.domain.model.Note
import com.example.itch.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

//important to note that repository uses to access our data sources directly
//here is where the implementation of our repository takes place
//our object dao is called for here and pulled directly from notedao
class NoteRepositoryImpl(
    private val dao: NoteDao
): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleNote(note)
    }
}