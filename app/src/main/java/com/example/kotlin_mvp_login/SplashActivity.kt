package com.example.kotlin_mvp_login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.kotlin_mvp_login.login.view.LoginActivity
import com.example.kotlin_mvp_login.tutorial.TutorialActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler().postDelayed(
            {
//                // Login screen
//                val intent = Intent(this, LoginActivity::class.java)
//                startActivity(intent)

                // Tutorial screen
                val intent = Intent(this, TutorialActivity::class.java)
                startActivity(intent)

                finish()
            },
            1000
        )
    }
}
