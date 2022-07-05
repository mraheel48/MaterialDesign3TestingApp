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

        binding.navigationRail.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.page_1 -> {
                    // Respond to navigation item 1 reselection
                    Log.d("myBottomClick", "Click 1")
                    true
                }

                R.id.page_2 -> {
                    // Respond to navigation item 2 reselection
                    Log.d("myBottomClick", "Click 2")
                    true
                }

                R.id.page_3 -> {
                    // Respond to navigation item 3 reselection
                    Log.d("myBottomClick", "Click 3")
                    true
                }

                R.id.page_4 -> {
                    // Respond to navigation item 3 reselection
                    Log.d("myBottomClick", "Click 4")
                    true
                }
                else->{
                    false
                }
            }
        }
    }
}