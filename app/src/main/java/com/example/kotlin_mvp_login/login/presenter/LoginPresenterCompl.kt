package com.example.kotlin_mvp_login.login.presenter

import com.example.kotlin_mvp_login.common.OkHttpRequest
import com.example.kotlin_mvp_login.login.view.ILoginView
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException

class LoginPresenterCompl(var iLoginView: ILoginView) : ILoginPresenter {

    override fun doLogin(username: String, password: String) {

        val request = OkHttpRequest()
        val url = "http://www.google.com"   // TO DO:
        val map: HashMap<String, String> = hashMapOf(
            "username" to username,
            "password" to password)
        try {
            request.post(
                url,
                map,
                object: Callback {
                    override fun onResponse(call: Call, response: Response) {
                        // Login succeeded
                        iLoginView.onLoginResult(true)  // TO DO:
                    }

                    override fun onFailure(call: Call, e: IOException) {
                        // Login failed
                        iLoginView.onLoginResult(false)  // TO DO:
                    }
                }
            )
        } catch (e: IOException) {
            e.printStackTrace()
            iLoginView.onLoginResult(false)
        }
    }

    override fun setProgressBarVisibility(visibility: Int) {
        iLoginView.onSetProgressBarVisibility(visibility)
    }
}