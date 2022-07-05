package com.example.materialdesign3testingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign3testingapp.databinding.ActivityMainBinding
import com.example.materialdesign3testingapp.uiTesing.BottomNavigationTest
import com.example.materialdesign3testingapp.uiTesing.CardViewTest
import com.example.materialdesign3testingapp.uiTesing.DialogText
import com.example.materialdesign3testingapp.uiTesing.NavigationDrawersTest

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    //Note:BottomNavigationView does not support more than 5 menu items.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.btnNavigation.setOnClickListener {
            startActivity(Intent(this, BottomNavigationTest::class.java))
        }

        mainBinding.btnCard.setOnClickListener {
            startActivity(Intent(this, CardViewTest::class.java))
        }

        mainBinding.btnDialog.setOnClickListener {
            startActivity(Intent(this, DialogText::class.java))
        }

        mainBinding.btnDrawer.setOnClickListener {
            startActivity(Intent(this, NavigationDrawersTest::class.java))
        }
    }
}