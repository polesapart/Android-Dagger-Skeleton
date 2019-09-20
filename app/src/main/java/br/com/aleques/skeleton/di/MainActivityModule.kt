package br.com.aleques.skeleton.di

import br.com.aleques.skeleton.ui.helloWorldFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributesHelloWorldFragment() : helloWorldFragment
}
