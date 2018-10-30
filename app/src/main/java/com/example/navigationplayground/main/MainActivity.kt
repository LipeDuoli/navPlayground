package com.example.navigationplayground.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigationplayground.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.mainNavigationFragment)

        NavigationUI.setupWithNavController(bottomNavigationView, navController)
        NavigationUI.setupWithNavController(toolbar, navController)

    }

    override fun onSupportNavigateUp() =
            findNavController(R.id.mainNavigationFragment).navigateUp()
}
