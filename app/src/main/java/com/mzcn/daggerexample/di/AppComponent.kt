package com.mzcn.daggerexample.di

import com.mzcn.daggerexample.view.MainActivity
import dagger.Component


@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

}