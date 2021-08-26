package nick.template.di

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import nick.template.R

@Module
@ContributesTo(MainScope::class)
abstract class MainModule {

    companion object {
        @Provides
        fun navController(activity: AppCompatActivity): NavController {
            val navHostFragment = activity.supportFragmentManager
                .findFragmentById(R.id.navHostContainer) as NavHostFragment
            return navHostFragment.navController
        }
    }
}
