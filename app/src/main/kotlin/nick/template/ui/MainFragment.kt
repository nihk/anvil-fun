package nick.template.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.squareup.anvil.annotations.ContributesMultibinding
import nick.template.R
import nick.template.databinding.MainFragmentBinding
import javax.inject.Inject
import nick.template.di.FragmentKey
import nick.template.di.MainScope

@ContributesMultibinding(MainScope::class)
@FragmentKey(MainFragment::class)
class MainFragment @Inject constructor(
    private val vmFactory: MainViewModel.Factory
) : Fragment(R.layout.main_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = MainFragmentBinding.bind(view)
    }
}
