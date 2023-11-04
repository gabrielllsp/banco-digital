package com.example.bancodigital.domain.auth

import com.example.bancodigital.data.model.User
import com.example.bancodigital.data.repositoty.auth.AuthFirebaseDatabaseSourceImpl
import javax.inject.Inject

class RegisterUseCase @Inject constructor(
    private val authFirebaseDatabaseSourceImpl: AuthFirebaseDatabaseSourceImpl
) {
    suspend operator fun invoke(user: User): User{
        return authFirebaseDatabaseSourceImpl.register(user)
    }
}