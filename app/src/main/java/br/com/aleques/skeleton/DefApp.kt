package br.com.aleques.skeleton

import br.com.aleques.skeleton.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class DefApp : DaggerApplication() {
//    @Inject
//    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().build()
    }
}