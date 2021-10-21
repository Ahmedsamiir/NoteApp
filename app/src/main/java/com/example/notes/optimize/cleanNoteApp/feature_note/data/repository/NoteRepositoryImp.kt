package com.example.notes.optimize.cleanNoteApp.feature_note.data.repository

import com.example.notes.optimize.cleanNoteApp.feature_note.domain.repository.NoteRepository
import com.example.notes.plcoding.cleanNoteApp.feature_note.data.data_source.NoteDao
import com.example.notes.plcoding.cleanNoteApp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImp(
    private val dao : NoteDao
) : NoteRepository {
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
        dao.deleteNote(note)
    }
}