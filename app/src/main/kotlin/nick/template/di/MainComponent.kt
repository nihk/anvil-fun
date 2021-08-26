package nick.template.di

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentFactory
import androidx.navigation.NavController
import com.squareup.anvil.annotations.MergeSubcomponent
import dagger.BindsInstance
import dagger.Subcomponent

@MergeSubcomponent(MainScope::class)
interface MainComponent {
    val fragmentFactory: FragmentFactory
    val navController: NavController

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance activity: AppCompatActivity): MainComponent
    }
}
