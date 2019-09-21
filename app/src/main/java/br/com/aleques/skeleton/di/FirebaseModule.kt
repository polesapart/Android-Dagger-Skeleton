package br.com.aleques.skeleton.di

import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import dagger.Module
import dagger.Provides

@Module
class FirebaseModule {
    @ActivityScope
    @Provides
    fun provideFirebaseAnalytics(context: Context): FirebaseAnalytics {
        return FirebaseAnalytics.getInstance(context)
    }

//    @ActivityScope
//    @Provides
//    fun
}
