package de.syntax_institut.projektwoche1.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import de.syntax_institut.projektwoche1.data.DataSource

@Composable
fun QuizCategories(
    onCategoryClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val quizCategories = DataSource().quizCategories

    LazyColumn(
        modifier = modifier
    ) {
        items(quizCategories.size) { index ->
            Button(
                onClick = {
                    onCategoryClick(quizCategories[index].id)
                }
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(text = quizCategories[index].name)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuizCategoriesPreview() {
    QuizCategories(onCategoryClick = {})
}