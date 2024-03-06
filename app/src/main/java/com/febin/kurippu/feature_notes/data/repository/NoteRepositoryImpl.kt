package com.febin.kurippu.feature_notes.data.repository

import com.febin.kurippu.feature_notes.data.data_source.NoteDao
import com.febin.kurippu.feature_notes.domain.model.Note
import com.febin.kurippu.feature_notes.domain.repository.NotesRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val noteDao: NoteDao
): NotesRepository {
    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        noteDao.deleteNote(note)
    }
}