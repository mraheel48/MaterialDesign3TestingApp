package com.example.materialdesign3testingapp.uiTesing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.materialdesign3testingapp.R
import com.example.materialdesign3testingapp.databinding.ActivityNavigationRailViewTestBinding

class NavigationRailViewTest : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationRailViewTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationRailViewTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
    }
}