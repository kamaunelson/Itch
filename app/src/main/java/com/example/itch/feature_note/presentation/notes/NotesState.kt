package com.example.itch.feature_note.presentation.notes

import com.example.itch.feature_note.domain.model.Note
import com.example.itch.feature_note.domain.util.NoteOrder
import com.example.itch.feature_note.domain.util.OrderType


//this states are used to define how the ui will receive data
// as follows
//state object
data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
