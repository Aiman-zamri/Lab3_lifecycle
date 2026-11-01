package com.example.lab3_lifecycle

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class LoggingActivity: AppCompatActivity() {
    private val tag get()="LC "+ javaClass.simpleName

    override fun onCreate(
        savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag,"On create (Saved state =${savedInstanceState != null }")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag,"ON start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag,"ON restart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag,"ON pause")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag,"ON resume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag,"ON syop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,"ON Destroy (isFinishing= $isFinishing ,changingConfig =$isChangingConfigurations")
    }
}