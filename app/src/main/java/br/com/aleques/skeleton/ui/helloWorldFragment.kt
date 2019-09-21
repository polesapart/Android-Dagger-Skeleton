package br.com.aleques.skeleton.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.aleques.skeleton.databinding.FragmentHelloWorldBinding
import br.com.aleques.skeleton.util.autoCleared
import br.com.aleques.skeleton.vo.ExampleData
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.perf.FirebasePerformance
import dagger.android.support.DaggerFragment
import javax.inject.Inject


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [helloWorldFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [helloWorldFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class helloWorldFragment : DaggerFragment() {

//    private var listener: OnFragmentInteractionListener? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }

    @Inject lateinit var mFirebaseAnalytics: FirebaseAnalytics
    @Inject lateinit var mFirebasePerf: FirebasePerformance

    private var binding by autoCleared<FragmentHelloWorldBinding>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_hello_world, container, false)
        binding = FragmentHelloWorldBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.user = ExampleData("John", "Snow")
        binding.setLifecycleOwner(viewLifecycleOwner)
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.TUTORIAL_BEGIN, null)
    }
//    // TODO: Rename method, update argument and hook method into UI event
//    fun onButtonPressed(uri: Uri) {
//        listener?.onFragmentInteraction(uri)
//    }

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        if (context is OnFragmentInteractionListener) {
//            listener = context
//        } else {
//            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
//        }
//    }

    override fun onDetach() {
        super.onDetach()
    }



}
