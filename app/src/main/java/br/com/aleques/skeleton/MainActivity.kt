package br.com.aleques.skeleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.aleques.skeleton.di.BaseActivity
import br.com.aleques.skeleton.svc.testService
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject lateinit var svc: testService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
