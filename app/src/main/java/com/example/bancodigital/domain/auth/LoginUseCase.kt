package com.example.bancodigital.domain.auth

import com.example.bancodigital.data.repositoty.auth.AuthFirebaseDatabaseSourceImpl

class LoginUseCase(
    private val authFirebaseDatabaseSourceImpl: AuthFirebaseDatabaseSourceImpl
) {
    suspend operator fun invoke(email: String, password: String){
        return authFirebaseDatabaseSourceImpl.login(email, password)
    }
}