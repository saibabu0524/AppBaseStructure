package com.saibabui.appbasestructure.auth.login.domain.repository

interface LoginRepository {
    suspend fun loginWithEmailAndPassword(email: String , password : String)
}