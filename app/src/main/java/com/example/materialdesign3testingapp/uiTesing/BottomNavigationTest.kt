package com.example.materialdesign3testingapp.uiTesing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.materialdesign3testingapp.R
import com.example.materialdesign3testingapp.databinding.ActivityBottomNavigationTestBinding

class BottomNavigationTest : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavigationTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*binding.bottomNavigation.setOnItemSelectedListener {

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

                else -> {
                    false
                }
            }

        }*/

        binding.bottomNavigation.setOnItemReselectedListener { item ->

            when (item.itemId) {

                R.id.page_1 -> {
                    // Respond to navigation item 1 reselection
                    Log.d("myBottomClick", "Click 1")
                }

                R.id.page_2 -> {
                    // Respond to navigation item 2 reselection
                    Log.d("myBottomClick", "Click 2")
                }

                R.id.page_3 -> {
                    // Respond to navigation item 3 reselection
                    Log.d("myBottomClick", "Click 3")
                }

                R.id.page_4 -> {
                    // Respond to navigation item 3 reselection
                    Log.d("myBottomClick", "Click 3")
                }
            }
        }


        val badge = binding.bottomNavigation.getOrCreateBadge(R.id.page_1)
        badge.isVisible = true
        // An icon only badge will be displayed unless a number is set:
        badge.number = 99

        binding.btnClear.setOnClickListener {
           /* val badgeDrawable = binding.bottomNavigation.getBadge(R.id.page_1)
            if (badgeDrawable != null) {
                badgeDrawable.isVisible = false
                badgeDrawable.clearNumber()
            }*/

            binding.bottomNavigation.removeBadge(R.id.page_1)
        }
    }
}