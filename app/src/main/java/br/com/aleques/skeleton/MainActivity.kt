package br.com.aleques.skeleton

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import br.com.aleques.skeleton.di.BaseActivity
import br.com.aleques.skeleton.svc.testService
import javax.inject.Inject

class MainActivity : BaseActivity() {

    internal fun navController(): NavController {
        return Navigation.findNavController(this, R.id.main_nav_host)
    }

    @Inject
    lateinit var svc: testService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
