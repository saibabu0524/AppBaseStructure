package com.saibabui.appbasestructure.common

import com.saibabui.appbasestructure.auth.login.data.remote.LoginApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val apiService: LoginApiService by lazy {
        retrofit.create(LoginApiService::class.java)
    }
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}