package de.syntax_institut.projektwoche1

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun EndScreen() {

    Column {

        Text("Spiel beendet!")

        Text("Du hast 5 Fragen richtig beantwortet.")

        Button(
            onClick = { }
        ) {
            Text("Nochmal spielen")
        }

    }
}

