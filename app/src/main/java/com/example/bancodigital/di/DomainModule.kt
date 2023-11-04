package com.example.bancodigital.di

import com.example.bancodigital.data.repositoty.auth.AuthFirebaseDataSource
import com.example.bancodigital.data.repositoty.auth.AuthFirebaseDatabaseSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun binsAuthRepository(
        authFirebaseDatabaseSourceImpl: AuthFirebaseDatabaseSourceImpl
    ): AuthFirebaseDataSource
}