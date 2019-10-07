package br.com.aleques.skeleton.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.aleques.skeleton.databinding.FragmentHelloWorldBinding
import br.com.aleques.skeleton.util.autoCleared
import br.com.aleques.skeleton.vo.ExampleData
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.perf.FirebasePerformance
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class helloWorldFragment : DaggerFragment() {

    @Inject
    lateinit var mFirebaseAnalytics: FirebaseAnalytics
    @Inject
    lateinit var mFirebasePerf: FirebasePerformance

    private var binding by autoCleared<FragmentHelloWorldBinding>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_hello_world, container, false)
        binding = FragmentHelloWorldBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.user = ExampleData("John", "Snow")
        binding.setLifecycleOwner(viewLifecycleOwner)
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.TUTORIAL_BEGIN, null)
    }
}
