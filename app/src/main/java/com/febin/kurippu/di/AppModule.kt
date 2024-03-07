package com.febin.kurippu.di

import android.app.Application
import androidx.room.Room
import com.febin.kurippu.feature_notes.data.data_source.NoteDatabase
import com.febin.kurippu.feature_notes.data.repository.NoteRepositoryImpl
import com.febin.kurippu.feature_notes.domain.repository.NotesRepository
import com.febin.kurippu.feature_notes.domain.use_case.AddNoteUseCase
import com.febin.kurippu.feature_notes.domain.use_case.DeleteNoteUseCase
import com.febin.kurippu.feature_notes.domain.use_case.GetNoteUseCase
import com.febin.kurippu.feature_notes.domain.use_case.GetNotesUseCase
import com.febin.kurippu.feature_notes.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    // Database instance provides to the application scope
    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    // Provide Note Repository
    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NotesRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    // Provide Note Use Cases
    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NotesRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotesUseCase(repository),
            deleteNote = DeleteNoteUseCase(repository),
            addNote = AddNoteUseCase(repository),
            getNote = GetNoteUseCase(repository)
        )
    }
}