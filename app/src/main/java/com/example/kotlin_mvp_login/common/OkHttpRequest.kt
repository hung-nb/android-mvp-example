package com.example.kotlin_mvp_login.common

import okhttp3.*

class OkHttpRequest {

    val client = OkHttpClient()

    fun get(url: String, callback: Callback): Call {
        val request = Request.Builder()
            .url(url)
            .build()
        val call = client.newCall(request)
        call.enqueue(callback)
        return call
    }

    fun post(url: String, parameters: HashMap<String, String>, callback: Callback): Call {
        val builder = FormBody.Builder()
        val it = parameters.entries.iterator()
        while (it.hasNext()) {
            val pair = it.next() as Map.Entry<*, *>
            builder.add(pair.key.toString(), pair.value.toString())
        }

        val formBody = builder.build()
        val request = Request.Builder()
            .url(url)
            .post(formBody)
            .build()


        val call = client.newCall(request)
        call.enqueue(callback)
        return call
    }
}