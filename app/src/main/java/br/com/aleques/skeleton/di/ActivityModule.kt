package br.com.aleques.skeleton.di

import br.com.aleques.skeleton.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun mainActivity() : MainActivity

    // Add other activities here
}
