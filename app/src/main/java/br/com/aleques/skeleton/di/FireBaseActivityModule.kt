package br.com.aleques.skeleton.di

import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.perf.FirebasePerformance
import dagger.Module
import dagger.Provides

@Module
class FireBaseActivityModule {
    @ActivityScope
    @Provides
    fun provideFirebaseAnalytics(context: Context): FirebaseAnalytics {
        return FirebaseAnalytics.getInstance(context)
    }

}
