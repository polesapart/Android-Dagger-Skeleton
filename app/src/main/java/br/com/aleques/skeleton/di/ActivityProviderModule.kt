package br.com.aleques.skeleton.di

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ActivityProviderModule {
    @ActivityScope
    @Provides
    fun provideActivityContext(activity: Activity): Context {
        return activity
    }


}
