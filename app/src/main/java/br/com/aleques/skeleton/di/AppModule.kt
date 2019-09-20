package br.com.aleques.skeleton.di

import dagger.Component

@Component
interface AppModule {
    @Component.Factory
    interface Factory {
        fun build() : AppModule
    }

}