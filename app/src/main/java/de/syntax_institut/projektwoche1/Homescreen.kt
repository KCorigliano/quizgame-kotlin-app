package de.syntax_institut.projektwoche1

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {

    Column {

        Text("Quiz App")

        Text("Teste dein Wissen!")

        Button(
            onClick = { }
        ) {
            Text("Spiel starten")
        }

    }

}