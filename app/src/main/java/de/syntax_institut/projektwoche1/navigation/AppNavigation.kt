package de.syntax_institut.projektwoche1.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import de.syntax_institut.projektwoche1.components.QuizCategories
import de.syntax_institut.projektwoche1.components.QuizList
import de.syntax_institut.projektwoche1.components.QuizPage
import de.syntax_institut.projektwoche1.data.Screen

@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Categories,
        modifier = modifier
    ) {
        composable<Screen.Categories> {
            QuizCategories(
                onCategoryClick = { categoryId ->
                    navController.navigate(Screen.Quizzes(categoryId))
                }
            )
        }

        composable<Screen.Quizzes> { backStackEntry ->
            val route: Screen.Quizzes = backStackEntry.toRoute()
            QuizList(
                categoryId = route.categoryId,
                onQuizClick = { quizId ->
                    navController.navigate(Screen.Quiz(quizId))
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable<Screen.Quiz> { backStackEntry ->
            val route: Screen.Quiz = backStackEntry.toRoute()
            QuizPage(
                selectedQuizId = route.quizId,
                onHomeClick = {
                    navController.navigate(Screen.Categories) {
                        popUpTo(Screen.Categories) { inclusive = true }
                    }
                }
            )
        }
    }
}
