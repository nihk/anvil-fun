package nick.template.ui

import android.app.Application
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Provider
import nick.template.di.MainScope

@ContributesBinding(MainScope::class)
class AppFragmentFactory @Inject constructor(
    private val fragments: Map<Class<out Fragment>, @JvmSuppressWildcards Provider<Fragment>>,
    private val application: Application // For demo purposes, to show that AppComponent deps are available in MainComponent
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        val fragmentClass: Class<out Fragment> = loadFragmentClass(classLoader, className)
        return fragments[fragmentClass]?.get() ?: super.instantiate(classLoader, className)
    }
}
