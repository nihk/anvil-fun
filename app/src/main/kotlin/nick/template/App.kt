package nick.template

import android.app.Application
import nick.template.di.AppComponent
import nick.template.di.DaggerAppComponent

class App : Application(), AppComponent.Owner {
    override val appComponent: AppComponent by lazy {
        DaggerAppComponent
            .factory()
            .create(this)
    }
}
