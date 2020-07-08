package br.com.aleques.skeleton.svc

import android.content.Context
import android.widget.Toast
import androidx.hilt.Assisted
import androidx.hilt.work.WorkerInject
import androidx.work.Worker
import androidx.work.WorkerParameters
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class Foo @Inject constructor()

class SampleWorker @WorkerInject constructor(
    @Assisted private val appContext: Context,
    @Assisted private val params: WorkerParameters,
    private val foo: Foo
) : Worker(appContext, params) {
    override fun doWork(): Result {
        Timber.d("Hello world!")
        Timber.d("Injected foo: $foo")
        CoroutineScope(Main).launch {
            Toast.makeText(appContext, "I'm a background worker!", Toast.LENGTH_SHORT).show()
        }
        return Result.success()
    }
}
