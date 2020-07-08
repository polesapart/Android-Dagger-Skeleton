package br.com.aleques.skeleton.di

import com.google.firebase.perf.FirebasePerformance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object FirebasePerformanceProvider {
    @Provides
    fun provideFirebasePerfService(): FirebasePerformance {
        return FirebasePerformance.getInstance()
    }
}
