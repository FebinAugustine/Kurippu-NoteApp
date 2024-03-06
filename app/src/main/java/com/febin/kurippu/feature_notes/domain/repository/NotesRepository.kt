package com.febin.kurippu.feature_notes.domain.repository

import com.febin.kurippu.feature_notes.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NotesRepository {
    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)

    // Repository decide from where it should load data from, local DB or network/Api.
    // Repository passes dat to the use case. Use cases doesn't care from where it gets the data from.
    // Fake repositories are used for testing.
    // To see the implementations of these go to data layer/repository.
}