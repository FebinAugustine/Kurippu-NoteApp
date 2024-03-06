package com.febin.kurippu.feature_notes.presentation.viewModel

import com.febin.kurippu.feature_notes.domain.model.Note
import com.febin.kurippu.feature_notes.domain.util.NoteOrder
import com.febin.kurippu.feature_notes.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
