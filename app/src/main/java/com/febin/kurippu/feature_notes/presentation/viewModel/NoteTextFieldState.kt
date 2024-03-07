package com.febin.kurippu.feature_notes.presentation.viewModel

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
) {
}