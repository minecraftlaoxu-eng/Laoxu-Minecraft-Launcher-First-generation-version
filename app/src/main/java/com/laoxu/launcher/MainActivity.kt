package com.laoxu.launcher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.laoxu.launcher.ui.screen.HomeScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(HomeScreen(this))
    }
}
