package com.example.notes.optimize.cleanNoteApp.feature_note.domain.use_case

import com.example.notes.optimize.cleanNoteApp.feature_note.domain.repository.NoteRepository
import com.example.notes.plcoding.cleanNoteApp.feature_note.domain.model.InvalidNoteException
import com.example.notes.plcoding.cleanNoteApp.feature_note.domain.model.Note

class AddNotes(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("The title of the note cannot be empty!")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("The content of the note cannot be empty!")
        }
        return repository.insertNote(note)
    }
}