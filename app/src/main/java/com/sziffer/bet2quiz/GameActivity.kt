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
        // Hide the status bar.
        actionBar?.hide()
        setContentView(R.layout.activity_game)
        with(gameWebView.settings) {
            allowContentAccess = true
            allowFileAccess = true
            databaseEnabled = true
            javaScriptEnabled = true
            domStorageEnabled = true
        }
        gameWebView.loadUrl("https://quizarena.bet2quiz.com")
    }
}