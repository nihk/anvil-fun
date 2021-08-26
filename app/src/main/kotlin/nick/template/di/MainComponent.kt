package nick.template.di

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentFactory
import androidx.navigation.NavController
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [MainModule::class])
interface MainComponent {
    val fragmentFactory: FragmentFactory
    val navController: NavController

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance activity: AppCompatActivity): MainComponent
    }
}
