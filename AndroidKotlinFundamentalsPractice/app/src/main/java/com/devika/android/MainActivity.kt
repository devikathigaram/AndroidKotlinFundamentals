package com.devika.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.devika.androidkotlinfundamentalspractice.R
import com.devika.androidkotlinfundamentalspractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var drawercontroller:DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_main
        )
        drawercontroller=binding.navigationDrawer
    val navController=this.findNavController(R.id.myNavHostFragment)

        NavigationUI.setupActionBarWithNavController(this,navController,drawercontroller)
        NavigationUI.setupWithNavController(binding.navView,navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navcontroller=this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp(navcontroller,drawercontroller)
    }

}
