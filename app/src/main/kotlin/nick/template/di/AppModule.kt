package nick.template.di

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
abstract class AppModule {

    companion object {
        @Provides
        fun appResources(application: Application) = application.resources
    }
}
