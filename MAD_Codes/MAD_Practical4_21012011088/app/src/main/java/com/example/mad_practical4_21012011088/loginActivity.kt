package com.example.mad_practical_4_21012011156

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signup:Button=findViewById<Button>(R.id.button4);
        signup.setOnClickListener{
            Intent(this@loginActivity,signupActivity::class.java).also{startActivity(it)}
        }
    }
}