package br.com.aleques.skeleton.di

import com.google.firebase.perf.FirebasePerformance
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FireBaseAppModule {
    @Singleton
    @Provides
    fun provideFirebasePerf(): FirebasePerformance {
        return FirebasePerformance.getInstance()
    }
}