package nick.template.di

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import nick.template.R
import nick.template.ui.AppFragmentFactory
import nick.template.ui.MainFragment

@Module
abstract class MainModule {

    companion object {
        @Provides
        fun navController(activity: AppCompatActivity): NavController {
            val navHostFragment = activity.supportFragmentManager
                .findFragmentById(R.id.navHostContainer) as NavHostFragment
            return navHostFragment.navController
        }
    }

    @Binds
    @IntoMap
    @FragmentKey(MainFragment::class)
    abstract fun mainFragment(mainFragment: MainFragment): Fragment

    @Binds
    abstract fun fragmentFactory(appFragmentFactory: AppFragmentFactory): FragmentFactory
}
