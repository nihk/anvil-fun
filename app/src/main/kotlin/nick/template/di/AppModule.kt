package nick.template.di

import android.app.Application
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides

@Module
@ContributesTo(AppScope::class)
abstract class AppModule {

    companion object {
        @Provides
        fun appResources(application: Application) = application.resources
    }
}
