package com.saibabui.appbasestructure.auth.login.presentation

import androidx.lifecycle.ViewModel
import com.saibabui.appbasestructure.auth.login.domain.repository.LoginRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginRepository: LoginRepository
) : ViewModel() {
}