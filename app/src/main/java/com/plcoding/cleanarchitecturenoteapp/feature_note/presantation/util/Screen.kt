package com.plcoding.cleanarchitecturenoteapp.feature_note.presantation.util

import android.transition.Scene

sealed class Screen(val route: String){
    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}
