package nick.template.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SubcomponentsModule::class, AppModule::class])
interface AppComponent {

    fun mainComponentFactory(): MainComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }

    interface Owner {
        val appComponent: AppComponent
    }
}
