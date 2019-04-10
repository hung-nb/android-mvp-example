package com.example.kotlin_mvp_login.login.view

interface ILoginView {
    fun onLoginResult(result: Boolean?)
    fun onSetProgressBarVisibility(visibility: Int)
}