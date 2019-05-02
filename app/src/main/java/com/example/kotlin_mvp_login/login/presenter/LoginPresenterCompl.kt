package com.example.kotlin_mvp_login.login.presenter

import android.view.View
import com.example.kotlin_mvp_login.login.view.ILoginView
import com.example.kotlin_mvp_login.common.network.ILoginRequest

class LoginPresenterCompl(var iLoginView: ILoginView, var iLoginRequest: ILoginRequest) : ILoginPresenter {

    override fun doLogin(username: String, password: String) {
        iLoginRequest.requestLogin(username, password) { complete ->

            iLoginView.onSetProgressBarVisibility(View.GONE)
            iLoginView.navigateToTutorialView()

            if (complete) {
                // Login succeeded
            } else {
                // Login failed
            }
        }
    }

    override fun setProgressBarVisibility(visibility: Int) {
        iLoginView.onSetProgressBarVisibility(visibility)
    }
}