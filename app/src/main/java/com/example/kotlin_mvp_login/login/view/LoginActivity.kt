package com.example.kotlin_mvp_login.login.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.kotlin_mvp_login.R
import com.example.kotlin_mvp_login.common.network.LoginRequest
import com.example.kotlin_mvp_login.login.presenter.LoginPresenterCompl
import com.example.kotlin_mvp_login.tutorial.View.TutorialActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), ILoginView, View.OnClickListener {

    private val loginRequest = LoginRequest()
    private val loginPresenter = LoginPresenterCompl(this, loginRequest)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onSetProgressBarVisibility(visibility: Int) {
        runOnUiThread({
            loginSpinner.visibility = visibility
        })
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

    override fun navigateToTutorialView() {
        val intent = Intent(this, TutorialActivity::class.java)
        startActivity(intent)
    }
}
