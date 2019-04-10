package com.example.kotlin_mvp_login.login.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_mvp_login.R

class LoginActivity : AppCompatActivity(), ILoginView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onLoginResult(result: Boolean?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSetProgressBarVisibility(visibility: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
