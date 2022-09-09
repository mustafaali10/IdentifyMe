package com.example.identifyme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button=findViewById(R.id.btn)
        val textview:EditText=findViewById(R.id.name)

        button.setOnClickListener {
            val intent=Intent(this,NameScreen::class.java)
            intent.putExtra(Constants.NAME,textview.text.toString())
            startActivity(intent)
        }


    }
}