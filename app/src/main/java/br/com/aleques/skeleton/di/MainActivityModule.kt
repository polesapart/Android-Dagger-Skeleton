package br.com.aleques.skeleton.di

import android.app.Activity
import br.com.aleques.skeleton.MainActivity
import br.com.aleques.skeleton.ui.helloWorldFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [ActivityProviderModule::class, FirebaseModule::class])
abstract class MainActivityModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [ExampleFragmentModule::class])
    abstract fun contributesHelloWorldFragment(): helloWorldFragment

    @ActivityScope
    @Binds
    abstract fun provideActivity(mainActivity: MainActivity): Activity
}
