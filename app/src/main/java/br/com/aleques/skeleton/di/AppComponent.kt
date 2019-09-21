package br.com.aleques.skeleton.di

import br.com.aleques.skeleton.DefApp
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        ActivityModule::class,
        FireBaseAppModule::class
        /*,
        AndroidWorkerModule::class,
        ActivityBuilder::class,
        AppModule::class*/
    ]
)
interface AppComponent : AndroidInjector<DefApp> {
    @Component.Builder
    interface Builder {
        fun build() : AppComponent
    }

}
