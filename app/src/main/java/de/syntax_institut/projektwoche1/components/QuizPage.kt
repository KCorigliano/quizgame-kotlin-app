package de.syntax_institut.projektwoche1.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import de.syntax_institut.projektwoche1.data.DataSource

@Composable
fun QuizPage(
    selectedQuizId: Int,
    onHomeClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    val quiz =
        DataSource().quizzes.find { it.id == selectedQuizId }
            ?: DataSource().quizzes.first()

    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    var currentPoint by remember { mutableIntStateOf(0) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {

        if (currentQuestionIndex < quiz.questions.size) {

            val question = quiz.questions[currentQuestionIndex]

            Text(
                text = "🎯 ${quiz.name}",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {

                Column(
                    modifier = Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {

                    Text(
                        text = "Frage ${currentQuestionIndex + 1} von ${quiz.questions.size}",
                        style = MaterialTheme.typography.labelLarge
                    )

                    Text(
                        text = question.question,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold
                    )

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier.height(220.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {

                        items(question.options) { option ->

                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                onClick = {

                                    if (option.isCorrect == 1) {
                                        currentPoint++
                                    }

                                    currentQuestionIndex++
                                }
                            ) {

                                Text(
                                    text = option.text,
                                    fontSize = 16.sp
                                )
                            }
                        }
                    }
                }
            }

        } else {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "🎉 Quiz beendet!",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Du hast",
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = "$currentPoint von ${quiz.questions.size}",
                    style = MaterialTheme.typography.displaySmall,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Fragen richtig beantwortet.",
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        currentQuestionIndex = 0
                        currentPoint = 0
                    }
                ) {
                    Text("🔄 Nochmal spielen")
                }

                Spacer(modifier = Modifier.height(12.dp))

                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onHomeClick
                ) {
                    Text("🏠 Zur Startseite")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuizPagePreview() {
    QuizPage(
        selectedQuizId = 1,
        onHomeClick = {}
    )
}