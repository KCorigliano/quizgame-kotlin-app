package de.syntax_institut.projektwoche1.data

class DataSource {

    val quizCategories = listOf(
        QuizCategory(
            id = 1,
            name = "General Knowledge"
        ),
        QuizCategory(
            id = 2,
            name = "Anime"
        ),
    )

    val quizzes = listOf(
        Quiz(
            id = 1,
            name = "General Knowledge 1",
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
            ),
            category = 1
        ),

        Quiz(
            id = 2,
            name = "Anime 1",
            questions = listOf(
                Question(
                    question = "Who is the main protagonist of 'One Piece'?",
                    options = listOf(
                        Option("Monkey D. Luffy", 1),
                        Option("Roronoa Zoro", 0),
                        Option("Naruto Uzumaki", 0),
                        Option("Ichigo Kurosaki", 0)
                    ),
                ),
                Question(
                    question = "In 'Death Note', what is the name of the Shinigami who drops his notebook?",
                    options = listOf(
                        Option("Rem", 0),
                        Option("Ryuk", 1),
                        Option("Sidoh", 0),
                        Option("Gelus", 0)
                    ),
                ),
                Question(
                    question = "What is the name of the giant wall that protects humanity in 'Attack on Titan'?",
                    options = listOf(
                        Option("Wall Maria", 1),
                        Option("Wall Sina", 0),
                        Option("Wall Rose", 0),
                        Option("All of the above", 0)
                    ),
                ),
                Question(
                    question = "Who is the main antagonist in the 'Naruto' series?",
                    options = listOf(
                        Option("Naruto Uzumaki", 0),
                        Option("Kakashi Hatake", 0),
                        Option("Naruto Uzumaki", 0),
                        Option("Itachi Uchiha", 1)
                    ),
                ),
                Question(
                    question = "In 'Bleach', what is the name of the main protagonist?",
                    options = listOf(
                        Option("Ichigo Kurosaki", 1),
                        Option("Naruto Uzumaki", 0),
                        Option("Sasuke Uchiha", 0),
                        Option("Hinata Hyuga", 0)
                    ),
                )
            ),
            category = 2
        ),
    )
}