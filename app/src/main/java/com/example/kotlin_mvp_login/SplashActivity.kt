package com.example.kotlin_mvp_login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_mvp_login.login.view.LoginActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Login screen
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}
