package br.com.aleques.skeleton

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import br.com.aleques.skeleton.di.BaseActivity
import br.com.aleques.skeleton.svc.SampleWorker

class MainActivity : BaseActivity() {

    internal fun navController(): NavController {
        return Navigation.findNavController(this, R.id.main_nav_host)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WorkManager.getInstance(this).enqueue(OneTimeWorkRequest.from(SampleWorker::class.java))
    }
}
