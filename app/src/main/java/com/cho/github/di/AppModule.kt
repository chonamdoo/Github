package com.cho.github.di

import android.content.Context
import com.cho.github.GithubApp
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideContext(application: GithubApp): Context {
        return application.applicationContext
    }

}