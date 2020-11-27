package com.sziffer.bet2quiz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        window.setFlags(WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
            WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED)

        // Hide the status bar.
        actionBar?.hide()
        setContentView(R.layout.activity_game)
        with(gameWebView.settings) {
            allowContentAccess = true
            allowFileAccess = true
            databaseEnabled = true
            javaScriptEnabled = true
            domStorageEnabled = true
            //blockNetworkLoads = true //!kills the app, don't use it!
        }
        gameWebView.loadUrl("https://quizarena.bet2quiz.com")
    }
}