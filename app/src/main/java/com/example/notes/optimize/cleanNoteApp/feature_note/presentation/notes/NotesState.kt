package com.example.notes.optimize.cleanNoteApp.feature_note.presentation.notes

import com.example.notes.optimize.cleanNoteApp.feature_note.domain.util.NoteOrder
import com.example.notes.optimize.cleanNoteApp.feature_note.domain.util.OrderType
import com.example.notes.plcoding.cleanNoteApp.feature_note.domain.model.Note

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder:NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible :Boolean = false

)
