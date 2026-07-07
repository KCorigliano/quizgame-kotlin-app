package de.syntax_institut.projektwoche1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import de.syntax_institut.projektwoche1.screens.HomeScreen
import de.syntax_institut.projektwoche1.ui.theme.Projektwoche1Theme

var points by mutableIntStateOf(0)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Projektwoche1Theme {
                HomeScreen()
            }
        }
    }
}