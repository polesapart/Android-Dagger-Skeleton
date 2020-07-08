package br.com.aleques.skeleton.di

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext

@Module
@InstallIn(ActivityComponent::class)
object FirebaseAnalyticsProvider {
    @Provides
    fun provideAnalyticsService(@ActivityContext context: Context  ): FirebaseAnalytics {
        return FirebaseAnalytics.getInstance(context)
    }
}
