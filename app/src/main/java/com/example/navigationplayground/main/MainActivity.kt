package com.example.navigationplayground.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.navigationplayground.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.mainNavigationFragment)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.call, R.id.agenda))
        toolbar.setupWithNavController(navController, appBarConfiguration)


        bottomNavigationView.setupWithNavController(navController)

    }

}
