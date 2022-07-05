package com.example.materialdesign3testingapp.uiTesing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign3testingapp.databinding.ActivityCardViewTestBinding

class CardViewTest : AppCompatActivity() {

    private lateinit var binding: ActivityCardViewTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardViewTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}