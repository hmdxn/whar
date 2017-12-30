package com.zigzag.whar

import com.zigzag.whar.di.DaggerAppComponent

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by salah on 30/12/17.
 */

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<App> = DaggerAppComponent
            .builder()
            .create(this@App)

}
