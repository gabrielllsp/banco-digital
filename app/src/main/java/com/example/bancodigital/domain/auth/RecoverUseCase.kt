package com.example.bancodigital.domain.auth

import com.example.bancodigital.data.repositoty.auth.AuthFirebaseDatabaseSourceImpl

class RecoverUseCase(
    private val authFirebaseDatabaseSourceImpl: AuthFirebaseDatabaseSourceImpl
) {
    suspend operator fun invoke(email: String){
        return authFirebaseDatabaseSourceImpl.recover(email)
    }
}