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
import androidx.compose.material3.Button
import androidx.compose.material3.Card
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
    val quiz = DataSource().quizzes.find { it.id == selectedQuizId } ?: DataSource().quizzes.first()
    var currentQuestionIndex by remember { mutableIntStateOf(0) }

    var currentPoint by remember { mutableIntStateOf(0) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        if (currentQuestionIndex < quiz.questions.size) {
            val question = quiz.questions[currentQuestionIndex]

            Spacer(modifier = Modifier.weight(1f))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Frage ${currentQuestionIndex + 1} von ${quiz.questions.size}",
                        style = MaterialTheme.typography.labelMedium
                    )

                    Text(
                        text = question.question,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.titleMedium
                    )

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier.height(160.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(question.options.size) { index ->
                            val option = question.options[index]
                            Button(
                                onClick = {
                                    if (option.isCorrect == 1) {
                                        currentPoint++
                                    }
                                    currentQuestionIndex++
                                }
                            ) {
                                Text(text = option.text)
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.weight(1f))

        } else {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Quiz beendet! Ihr Ergebnis: $currentPoint/${quiz.questions.size}",
                    style = MaterialTheme.typography.headlineSmall
                )
                Button(onClick = {
                    currentQuestionIndex = 0
                    currentPoint = 0
                }) {
                    Text("Nochmal versuchen")
                }
                Button(onClick = onHomeClick) {
                    Text("Home")
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