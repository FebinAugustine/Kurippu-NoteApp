package com.febin.kurippu.feature_notes.presentation.screens.add_edit_note.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun TextInputFieldBasic(
    text: String,
    hint: String,
    label: String,
    modifier: Modifier = Modifier,
    isHintVisible: Boolean = true,
    onValueChange: (String) -> Unit,
    singleLine: Boolean = false,
    textStyle: TextStyle = TextStyle(),
    onFocusChange: (FocusState) -> Unit
) {
    Box(
        modifier = modifier
    ) {
        OutlinedTextField(
            value = text,
            label = { Text(text = label) },
            placeholder = { Text(text = hint) },
            onValueChange = onValueChange,
            singleLine = singleLine,
            textStyle = textStyle,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.DarkGray
            ),
            modifier = Modifier
                .fillMaxWidth()
                .onFocusChanged { onFocusChange(it) }
        )
        if (isHintVisible) {
            Text(
                text = hint,
                modifier = Modifier
                    .padding(10.dp),
                style = textStyle,
                color = Color.DarkGray
            )
        }
    }
}