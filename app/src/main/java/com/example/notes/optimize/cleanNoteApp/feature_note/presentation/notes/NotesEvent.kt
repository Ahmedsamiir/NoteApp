package com.example.notes.optimize.cleanNoteApp.feature_note.presentation.notes

import com.example.notes.optimize.cleanNoteApp.feature_note.domain.util.NoteOrder
import com.example.notes.plcoding.cleanNoteApp.feature_note.domain.model.Note

sealed class NotesEvent{
    data class Order(val  noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note : Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}
