package com.example.mad_practical_4_21012011156

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.mad_practical4_21012011088.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login:Button=findViewById<Button>(R.id.login);
        val signup:Button=findViewById<Button>(R.id.signup);
        login.setOnClickListener{
            Intent(this@MainActivity,loginActivity::class.java).also { startActivity(it) }
        }
        signup.setOnClickListener{
            Intent(this@MainActivity,signupActivity::class.java).also{startActivity(it)}
        }

    }
}