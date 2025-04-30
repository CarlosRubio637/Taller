package com.pmtaller2.carlosrubio_00000822.myapplication.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pmtaller2.carlosrubio_00000822.myapplication.model.Restaurant
import com.pmtaller2.carlosrubio_00000822.myapplication.ui.screens.*

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Restaurants : Screen("restaurants", "Restaurantes", Icons.Default.ShoppingCart)
    object Search      : Screen("search",      "Buscar",      Icons.Default.Search)
    object Orders      : Screen("orders",      "Órdenes",     Icons.Default.List)
    object Menu        : Screen("menu",        "Menú",        Icons.Default.Menu)
}

@Composable
fun BottomNavGraph(innerPadding1: PaddingValues) {
    val navController = rememberNavController()
    var selectedRestaurant = remember { mutableStateOf<Restaurant?>(null) }

    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Restaurants.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Restaurants.route) {
                RestaurantListScreen { restaurant ->
                    selectedRestaurant.value = restaurant
                    navController.navigate(Screen.Menu.route)
                }
            }
            composable(Screen.Search.route) {
                SearchScreen { restaurant ->
                    selectedRestaurant.value = restaurant
                    navController.navigate(Screen.Menu.route)
                }
            }
            composable(Screen.Orders.route) {
                OrdersScreen()
            }
            composable(Screen.Menu.route) {
                selectedRestaurant.value?.let { restaurant ->
                    RestaurantMenuScreen(
                        restaurant = restaurant,
                        onBack = { navController.popBackStack() }
                    )
                }
            }
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf(Screen.Restaurants, Screen.Search, Screen.Orders)
    val currentRoute = navController.currentBackStackEntry?.destination?.route

    NavigationBar {
        items.forEach { screen ->
            NavigationBarItem(
                icon        = { Icon(screen.icon, contentDescription = screen.title) },
                label       = { Text(screen.title) },
                selected    = currentRoute == screen.route,
                onClick     = {
                    navController.navigate(screen.route) {
                        launchSingleTop = true
                        restoreState    = true
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                    }
                }
            )
        }
    }
}
