package com.example.projetofinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class inicioScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_screen)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView);
        val navController = findNavController(R.id.fragment)

        bottomNavigationView.setupWithNavController(navController)



    }
}