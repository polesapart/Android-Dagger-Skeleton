package br.com.aleques.skeleton.di

import androidx.work.ListenableWorker
import br.com.aleques.skeleton.svc.ChildWorkerFactory
import br.com.aleques.skeleton.svc.SampleWorker
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@MapKey
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class WorkerKey(val value: KClass<out ListenableWorker>)

@Module
interface WorkerBindingModule {
    @Binds
    @IntoMap
    @WorkerKey(SampleWorker::class)
    fun bindSampleWorldWorker(factory: SampleWorker.Factory): ChildWorkerFactory
}

