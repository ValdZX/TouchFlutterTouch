package ua.com.vald_zx.touchfluttertouch.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import io.flutter.embedding.android.FlutterFragment
import ua.com.vald_zx.touchfluttertouch.R


class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
        private const val TAG_FLUTTER_FRAGMENT = "flutter_fragment"
    }

    private var flutterFragment: FlutterFragment? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_flutter, container, false)
        val manager: FragmentManager = childFragmentManager
        flutterFragment = manager.findFragmentByTag(TAG_FLUTTER_FRAGMENT) as FlutterFragment?
        if (flutterFragment == null) {
            val newFlutterFragment = FlutterFragment.createDefault()
            flutterFragment = newFlutterFragment
            manager.beginTransaction()
                    .add(R.id.flutterContainer, newFlutterFragment, TAG_FLUTTER_FRAGMENT)
                    .commit()
        }
        return view
    }
}
