package com.example.mad_practical2_21012011088

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayToast("onCreate called")
//        displaySnackbar("onCreate called")
    }

    override fun onStart() {
        super.onStart()
        displayToast("onStart called")
//        displaySnackbar("onStart called")
    }

    override fun onResume() {
        super.onResume()
        displayToast("onResume called")
//        displaySnackbar("onResume called")
    }

    override fun onPause() {
        super.onPause()
        displayToast("onPause called")
//        displaySnackbar("onPause called")
    }

    override fun onStop() {
        super.onStop()
        displayToast("onStop called")
//        displaySnackbar("onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        displayToast("onDestroy called")
//        displaySnackbar("onDestroy called")
    }

    fun displayToast(msg:String){
        Toast.makeText(this , msg , Toast.LENGTH_LONG).show();
    }

    fun displaySnackbar(msg: String){
        Snackbar.make(findViewById(R.id.MainPage) , msg , Snackbar.LENGTH_LONG).show();
    }
}