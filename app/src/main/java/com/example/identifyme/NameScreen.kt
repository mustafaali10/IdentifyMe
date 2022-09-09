package com.example.identifyme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams

class NameScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //Navigation Bar Disable Temporarily
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        setContentView(R.layout.activity_name_screen)





        val name2:TextView=findViewById(R.id.name_Onscreen)
        val layout: View =findViewById(R.id.layout)

       val n=intent.getStringExtra(Constants.NAME)
        name2.text = n
        layout?.setBackgroundResource(R.color.bright_yellow)






    }
}
