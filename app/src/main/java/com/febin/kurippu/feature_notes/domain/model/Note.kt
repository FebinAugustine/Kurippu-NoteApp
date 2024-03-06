package com.febin.kurippu.feature_notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.febin.kurippu.ui.theme.BabyBlue
import com.febin.kurippu.ui.theme.LightGreen
import com.febin.kurippu.ui.theme.RedOrange
import com.febin.kurippu.ui.theme.RedPink
import com.febin.kurippu.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)
