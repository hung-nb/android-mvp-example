package com.example.kotlin_mvp_login.common.network

interface ILoginRequest {
    fun requestLogin(username: String, password: String, complete: (Boolean) -> Unit)
}