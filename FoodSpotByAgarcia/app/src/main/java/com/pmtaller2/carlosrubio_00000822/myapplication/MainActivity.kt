package com.pmtaller2.carlosrubio_00000822.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.pmtaller2.carlosrubio_00000822.myapplication.ui.navigation.BottomNavGraph
import com.pmtaller2.carlosrubio_00000822.myapplication.ui.theme.FoodSpotByAgarciaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByAgarciaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BottomNavGraph(innerPadding)
                }
            }
        }
    }
}

