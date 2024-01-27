package com.example.itch.feature_note.presentation.notes

import com.example.itch.feature_note.domain.model.Note
import com.example.itch.feature_note.domain.util.NoteOrder

//used to declare the actions that have taken place
sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}