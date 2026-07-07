package de.syntax_institut.projektwoche1.data

import kotlinx.serialization.Serializable

@Serializable
data class Quiz(
    val questions: List<Question>
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