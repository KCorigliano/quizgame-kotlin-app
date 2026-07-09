package de.syntax_institut.projektwoche1

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun QuizScreen() {

    Column {

        Text("Frage 1 von 10")

        Text("Wie heißt die Hauptstadt von Deutschland?")

        Button(onClick = { }) {
            Text("Berlin")
        }

        Button(onClick = { }) {
            Text("Paris")
        }

        Button(onClick = { }) {
            Text("Rom")
        }

        Button(onClick = { }) {
            Text("Madrid")
        }
    }
}