package com.mzcn.daggerexample.di

import com.mzcn.daggerexample.model.User
import dagger.Module
import dagger.Provides


@Module
class AppModule {

    @Provides
    fun provideUserAddress() : User {
        return User(address = "Kemer/Antalya")
    }

}