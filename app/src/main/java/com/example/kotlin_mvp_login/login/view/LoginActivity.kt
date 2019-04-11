package com.example.kotlin_mvp_login.login.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.kotlin_mvp_login.R
import com.example.kotlin_mvp_login.list.view.ListActivity
import com.example.kotlin_mvp_login.login.presenter.LoginPresenterCompl
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), ILoginView, View.OnClickListener {

    private val loginPresenter = LoginPresenterCompl(this)
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onLoginResult(result: Boolean?) {

        handler.post {
            loginPresenter.setProgressBarVisibility(View.GONE)
        }

        if (result == true) {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSetProgressBarVisibility(visibility: Int) {
        loginSpinner.visibility = visibility
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnLogin -> {

                loginPresenter?.setProgressBarVisibility(View.VISIBLE)

                loginPresenter?.doLogin(
                    txtUsername.text.toString(),
                    txtPassword.text.toString()
                )
            }
            else -> {
            }
        }
    }
}
