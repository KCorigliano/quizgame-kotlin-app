package de.syntax_institut.projektwoche1.data

import kotlinx.serialization.Serializable

@Serializable
data class Quiz(
    val id: Int,
    val name: String,
    val questions: List<Question>,
    val category: Int
)

@Serializable
data class Question(
    val question: String,
    val options: List<Option>,
)

@Serializable
data class Option(
    val text: String,
    val isCorrect: Int
)

@Serializable
data class QuizCategory(
    val id: Int,
    val name: String
)

@Serializable
sealed interface Screen {
    @Serializable
    data object Categories : Screen

    @Serializable
    data class Quizzes(val categoryId: Int) : Screen

    @Serializable
    data class Quiz(val quizId: Int) : Screen
}