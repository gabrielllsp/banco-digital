package com.example.bancodigital.domain.auth

import com.example.bancodigital.data.repositoty.auth.AuthFirebaseDatabaseSourceImpl

class RegisterUseCase(
    private val authFirebaseDatabaseSourceImpl: AuthFirebaseDatabaseSourceImpl
) {
    suspend operator fun invoke(nome: String, email: String, phone: String, password: String){
        return authFirebaseDatabaseSourceImpl.register(nome, email, phone, password)
    }
}