package com.febin.kurippu.feature_notes.presentation.events

import com.febin.kurippu.feature_notes.domain.model.Note
import com.febin.kurippu.feature_notes.domain.util.NoteOrder

sealed class NotesEvents {
    data class Order(val noteOrder: NoteOrder) : NotesEvents()
    data class DeleteNote(val note: Note) : NotesEvents()
    object RestoreNote : NotesEvents()
    object ToggleOrderSection : NotesEvents()
}