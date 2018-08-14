package com.cho.github

import com.cho.github.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class GithubApp : DaggerApplication(){
    override fun onCreate() {
        super.onCreate()
    }
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}