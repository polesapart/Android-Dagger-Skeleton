package br.com.aleques.skeleton

import androidx.work.Configuration
import androidx.work.WorkManager
import br.com.aleques.skeleton.di.DaggerAppComponent
import br.com.aleques.skeleton.svc.SampleWorkerFactory
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.DaggerApplication
import javax.inject.Inject

class DefApp : DaggerApplication() {
    @Inject
    lateinit var workerFactory: SampleWorkerFactory

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().build()
    }

    override fun onCreate() {
        super.onCreate()
        WorkManager.initialize(
            this,
            Configuration.Builder().setWorkerFactory(workerFactory).build()
        )
    }
}