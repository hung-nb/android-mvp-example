package com.example.kotlin_mvp_login.login.presenter

import com.example.kotlin_mvp_login.login.view.ILoginView

class LoginPresenterCompl(var iLoginView: ILoginView) : ILoginPresenter {
    override fun doLogin(username: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setProgressBarVisibility(visibility: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}