package com.example.mad_practical6_21012011088

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Play: ImageView =findViewById(R.id.Play_Button)

        Play.setOnClickListener {
            PlayPause()
        }
        val Pause : ImageView =findViewById(R.id.Pause_Button)

        Pause.setOnClickListener {
            Stop()
        }
    }

    fun PlayPause(){
        Intent(applicationContext, AudioService::class.java).putExtra(AudioService.PLAYERKEY, AudioService.PLAYERVALUE).apply {
            startService(this)
        }

    }

    fun Stop(){
        Intent(applicationContext, AudioService::class.java).putExtra(AudioService.PLAYERKEY, AudioService.PLAYERVALUE).apply {
            stopService(this)
        }

    }
}