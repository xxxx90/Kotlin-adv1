package ru.netology.nmedia.di

import com.google.firebase.installations.FirebaseInstallations
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class FirebaseInstallationsModule {

    @Singleton
    @Provides
    fun provideFirebaseInstallations(): FirebaseInstallations = FirebaseInstallations.getInstance()

}