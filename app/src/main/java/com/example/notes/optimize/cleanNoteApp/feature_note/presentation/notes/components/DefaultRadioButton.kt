package com.example.notes.optimize.cleanNoteApp.feature_note.presentation.notes.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

@Composable
fun DefaultRadioButton (
    text:String,
    selected: Boolean,
    onSelect: ()-> Unit,
    modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier
){
    Row (
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ){
        RadioButton(
            selected = selected,
            onClick = onSelect,
            colors = RadioButtonDefaults.colors(
                selectedColor = MaterialTheme.colors.primary,
                unselectedColor = MaterialTheme.colors.onBackground
            )
        )
        Spacer(modifier = androidx.compose.ui.Modifier.width(8.dp))
        Text(text = text, style = MaterialTheme.typography.body1)
    }
}