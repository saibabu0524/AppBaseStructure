package com.saibabui.appbasestructure.auth.login.data.remote


import retrofit2.http.POST

interface LoginApiService {
    @POST
    fun loginWithEmailAndPassword()
}