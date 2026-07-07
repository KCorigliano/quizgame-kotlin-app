package de.syntax_institut.projektwoche1.data

class DataSource {

    val quizzes = listOf(
        Quiz(
            questions = listOf(
                Question(
                    question = "What is the capital of France?",
                    options = listOf(
                        Option("Paris", 1),
                        Option("London", 0),
                        Option("Berlin", 0),
                        Option("Madrid", 0)
                    ),
                ),
                Question(
                    question = "Which planet is known as the Red Planet?",
                    options = listOf(
                        Option("Mars", 1),
                        Option("Venus", 0),
                        Option("Jupiter", 0),
                        Option("Saturn", 0)
                    ),
                ),
                Question(
                    question = "What is the largest mammal in the world?",
                    options = listOf(
                        Option("Elephant", 0),
                        Option("Blue Whale", 1),
                        Option("Giraffe", 0),
                        Option("Hippopotamus", 0)
                    ),
                ),
                Question(
                    question = "Who painted the Mona Lisa?",
                    options = listOf(
                        Option("Leonardo da Vinci", 1),
                        Option("Pablo Picasso", 0),
                        Option("Vincent van Gogh", 0),
                        Option("Michelangelo", 0)
                    ),
                ),
                Question(
                    question = "What is the largest country in the world by land area?",
                    options = listOf(
                        Option("Russia", 1),
                        Option("Canada", 0),
                        Option("China", 0),
                        Option("United States", 0)
                    ),
                )
            )
        )
    )
}