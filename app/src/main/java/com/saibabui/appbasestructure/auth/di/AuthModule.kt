package com.saibabui.appbasestructure.auth.di

import com.google.firebase.auth.FirebaseAuth
import com.saibabui.appbasestructure.auth.login.data.remote.LoginApiService
import com.saibabui.appbasestructure.auth.login.data.repository.LoginRepositoryImpl
import com.saibabui.appbasestructure.auth.login.domain.repository.LoginRepository
import com.saibabui.appbasestructure.common.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthModule {
    @Provides
    @Singleton
    fun provideFireBaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    @Provides
    @Singleton
    fun provideLoginRepository(
        firebaseAuth: FirebaseAuth,
        loginApiService: LoginApiService
    ): LoginRepository = LoginRepositoryImpl(firebaseAuth, loginApiService)


    @Provides
    @Singleton
    fun provideLoginApi(): LoginApiService = RetrofitClient.apiService
}