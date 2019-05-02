package com.example.kotlin_mvp_login.common.network

import com.example.kotlin_mvp_login.common.OkHttpRequest
import okhttp3.*
import okhttp3.RequestBody
import org.json.JSONException
import org.json.JSONObject
import okhttp3.OkHttpClient
import java.io.IOException

class LoginRequest : ILoginRequest {

    override fun requestLogin(username: String, password: String, complete: (Boolean) -> Unit) {

//        val postData = JSONObject()
//        try {
//            postData.put("UserName", username)
//            postData.put("Password", password)
//        } catch (e: JSONException) {
//            e.printStackTrace()
//        }
//
//        val mediaType = MediaType.parse("application/json")
//        val body = RequestBody.create(mediaType, postData.toString())
//        val request = Request.Builder()
//            .url("http://www.google.com")
//            .post(body)
//            .addHeader("Content-Type", "application/json")
//            .addHeader("cache-control", "no-cache")
//            .build()
//
//        val client = OkHttpClient()
//        //val response = client.newCall(request).execute()  // TO DO: Error: android.os.NetworkOnMainThreadException
//
//        //return response.code()
//        Thread.sleep(1_000)
//        return 200

        val request = OkHttpRequest()
        val url = "http://www.google.com"   // TO DO:
        val map: HashMap<String, String> = hashMapOf(
            "username" to username,
            "password" to password
        )
        try {
            request.post(
                url,
                map,
                object : Callback {
                    override fun onResponse(call: Call, response: Response) {
                        // Login succeeded
                        complete(true)
                    }

                    override fun onFailure(call: Call, e: IOException) {
                        // Login failed
                        complete(false)
                    }
                }
            )
        } catch (e: IOException) {
            e.printStackTrace()
            complete(false)
        }
    }
}