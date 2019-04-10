package com.example.kotlin_mvp_login.login.presenter

interface ILoginPresenter {
    fun doLogin(username: String, password: String)
    fun setProgressBarVisibility(visibility: Int)
}