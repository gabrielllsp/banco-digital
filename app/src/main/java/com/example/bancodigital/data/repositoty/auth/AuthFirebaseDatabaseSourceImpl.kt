package com.example.bancodigital.data.repositoty.auth

import com.google.firebase.database.FirebaseDatabase

class AuthFirebaseDatabaseSourceImpl(
    firebaseDatabase: FirebaseDatabase
): AuthFirebaseDataSource {
    override suspend fun login(email: String, password: String) {
        TODO("Not yet implemented")
    }

    override suspend fun register(nome: String, email: String, phone: String, password: String) {
        TODO("Not yet implemented")
    }

    override suspend fun recover(email: String) {
        TODO("Not yet implemented")
    }
}