package nick.template.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.createGraph
import androidx.navigation.fragment.fragment
import nick.template.R
import nick.template.di.AppComponent

class MainActivity : AppCompatActivity(R.layout.main_activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        val mainComponent = (application as AppComponent.Owner).appComponent
            .mainComponentFactory()
            .create(this)
        supportFragmentManager.fragmentFactory = mainComponent.fragmentFactory
        super.onCreate(savedInstanceState)
        createNavGraph(mainComponent.navController)
    }

    private fun createNavGraph(navController: NavController) {
        navController.graph = navController.createGraph(
            startDestination = "template/main"
        ) {
            fragment<MainFragment>(route = "template/main")
        }
    }
}
