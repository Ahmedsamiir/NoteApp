package com.example.notes.optimize.cleanNoteApp.di

import android.app.Application
import androidx.room.Room
import com.example.notes.optimize.cleanNoteApp.feature_note.data.repository.NoteRepositoryImp
import com.example.notes.optimize.cleanNoteApp.feature_note.domain.repository.NoteRepository
import com.example.notes.optimize.cleanNoteApp.feature_note.domain.use_case.AddNotes
import com.example.notes.optimize.cleanNoteApp.feature_note.domain.use_case.DeleteNote
import com.example.notes.optimize.cleanNoteApp.feature_note.domain.use_case.GetNotes
import com.example.notes.optimize.cleanNoteApp.feature_note.domain.use_case.NotesUseCases
import com.example.notes.plcoding.cleanNoteApp.feature_note.data.data_source.NoteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(app:Application) : NoteDatabase{
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()


    }

    @Provides
    @Singleton
    fun provideNoteRepository(db:NoteDatabase) : NoteRepository{
        return NoteRepositoryImp(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository):NotesUseCases {
        return NotesUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNotes(repository),
        )
    }
}