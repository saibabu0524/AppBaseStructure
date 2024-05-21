package com.saibabui.appbasestructure.auth.login.data.repository

import com.google.firebase.auth.FirebaseAuth
import com.saibabui.appbasestructure.auth.login.data.remote.LoginApiService
import com.saibabui.appbasestructure.auth.login.domain.repository.LoginRepository
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val firebaseAuth : FirebaseAuth,
    private val loginApi: LoginApiService
) : LoginRepository {
    override suspend fun loginWithEmailAndPassword(email: String, password: String) {
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
            if (it.isSuccessful){

            }
        }
    }
}