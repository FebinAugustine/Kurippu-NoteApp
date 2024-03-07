package com.febin.kurippu.feature_notes.domain.use_case

import com.febin.kurippu.feature_notes.domain.model.Note
import com.febin.kurippu.feature_notes.domain.repository.NotesRepository

class GetNoteUseCase(
    private val repository: NotesRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}