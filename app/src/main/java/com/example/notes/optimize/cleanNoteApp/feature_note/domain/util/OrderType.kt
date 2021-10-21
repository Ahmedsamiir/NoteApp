package com.example.notes.optimize.cleanNoteApp.feature_note.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
