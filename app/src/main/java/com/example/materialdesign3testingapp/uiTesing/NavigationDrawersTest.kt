package com.example.materialdesign3testingapp.uiTesing


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.GravityCompat
import com.example.materialdesign3testingapp.R
import com.example.materialdesign3testingapp.databinding.ActivityNavigationDrawersTestBinding

class NavigationDrawersTest : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationDrawersTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationDrawersTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuBtn.setOnClickListener {
            binding.drawer.openDrawer(GravityCompat.START)
        }

        binding.navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.page_1 -> {
                    // Respond to navigation item 1 reselection
                    Log.d("myBottomClick", "Click 1")
                    closeDrawer()
                }

                R.id.page_2 -> {
                    // Respond to navigation item 2 reselection
                    Log.d("myBottomClick", "Click 2")
                    closeDrawer()
                }

                R.id.page_3 -> {
                    // Respond to navigation item 3 reselection
                    Log.d("myBottomClick", "Click 3")
                    closeDrawer()
                }

                R.id.page_4 -> {
                    // Respond to navigation item 3 reselection
                    Log.d("myBottomClick", "Click 4")
                    closeDrawer()
                }
            }
            true
        }

    }

    fun closeDrawer(){
        if (binding.drawer.isDrawerOpen(GravityCompat.START)) {
            binding.drawer.closeDrawer(GravityCompat.START)
        }
    }

    override fun onBackPressed() {
        if (binding.drawer.isDrawerOpen(GravityCompat.START)) {
            binding.drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}