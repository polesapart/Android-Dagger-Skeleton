package br.com.aleques.skeleton.di

import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Module


@Module(includes = [AssistedInject_WorkerInjectModule::class])
@AssistedModule
interface WorkerInjectModule



