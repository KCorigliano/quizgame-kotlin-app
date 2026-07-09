package de.syntax_institut.projektwoche1.data

class DataSource {

    val quizCategories = listOf(
        QuizCategory(id = 1, name = "General Knowledge"),
        QuizCategory(id = 2, name = "Anime"),
        QuizCategory(id = 3, name = "Geography"),
        QuizCategory(id = 4, name = "Science")
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
            name = "General Knowledge 2",
            questions = listOf(
                Question(
                    question = "How many elements are in the periodic table?",
                    options = listOf(
                        Option("118", 1),
                        Option("112", 0),
                        Option("120", 0),
                        Option("108", 0)
                    ),
                ),
                Question(
                    question = "What is the currency of Japan?",
                    options = listOf(
                        Option("Yen", 1),
                        Option("Won", 0),
                        Option("Yuan", 0),
                        Option("Baht", 0)
                    ),
                ),
                Question(
                    question = "Which is the smallest continent?",
                    options = listOf(
                        Option("Australia", 1),
                        Option("Europe", 0),
                        Option("Antarctica", 0),
                        Option("South America", 0)
                    ),
                )
            ),
            category = 1
        ),

        Quiz(
            id = 3,
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
                        Option("Madara Uchiha", 1),
                        Option("Kakashi Hatake", 0),
                        Option("Naruto Uzumaki", 0),
                        Option("Sakura Haruno", 0)
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

        Quiz(
            id = 4,
            name = "Anime 2",
            questions = listOf(
                Question(
                    question = "What is the name of Goku's signature move in Dragon Ball?",
                    options = listOf(
                        Option("Kamehameha", 1),
                        Option("Rasengan", 0),
                        Option("Chidori", 0),
                        Option("Getsuga Tensho", 0)
                    ),
                ),
                Question(
                    question = "In 'Fullmetal Alchemist', what is the Law of Alchemy called?",
                    options = listOf(
                        Option("Equivalent Exchange", 1),
                        Option("Universal Balance", 0),
                        Option("Natural Order", 0),
                        Option("Alchemical Flow", 0)
                    ),
                )
            ),
            category = 2
        ),

        Quiz(
            id = 5,
            name = "Geography 1",
            questions = listOf(
                Question(
                    question = "What is the longest river in the world?",
                    options = listOf(
                        Option("Nile", 1),
                        Option("Amazon", 0),
                        Option("Yangtze", 0),
                        Option("Mississippi", 0)
                    ),
                ),
                Question(
                    question = "Which country has the most natural lakes?",
                    options = listOf(
                        Option("Canada", 1),
                        Option("Russia", 0),
                        Option("USA", 0),
                        Option("Brazil", 0)
                    ),
                )
            ),
            category = 3
        ),

        Quiz(
            id = 6,
            name = "Science 1",
            questions = listOf(
                Question(
                    question = "What is the chemical symbol for Gold?",
                    options = listOf(
                        Option("Au", 1),
                        Option("Ag", 0),
                        Option("Fe", 0),
                        Option("Pb", 0)
                    ),
                ),
                Question(
                    question = "What is the speed of light?",
                    options = listOf(
                        Option("299,792,458 m/s", 1),
                        Option("150,000,000 m/s", 0),
                        Option("500,000,000 m/s", 0),
                        Option("1,000,000,000 m/s", 0)
                    ),
                )
            ),
            category = 4
        )
    )
}
