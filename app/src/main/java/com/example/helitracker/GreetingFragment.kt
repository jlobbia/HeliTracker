package com.example.helitracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.helitracker.databinding.FragmentGreetingBinding
import com.example.helitracker.ui.Custom1Fragment

class GreetingFragment : Fragment() {    companion object {
    val BUNDLE_GALLERY_INFO = "gallery info"
}
    private var _binding: FragmentGreetingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGreetingBinding.inflate(inflater, container, false)
        val root: View = binding.root





        binding.toGreetingButton.setOnClickListener {
            val bundle = Bundle()
            val stufftopass : String = binding.stufftopass.text.toString()
            bundle.putString(Custom1Fragment.BUNDLE_GALLERY_INFO, stufftopass)
            root.findNavController().navigate(R.id.action_nav_greeting_to_nav_home, bundle)
        }

//        val textView: TextView = binding.
//        textView.text = "this is the greetingfrag"

//        binding.buttonGallery.setOnClickListener {
//            val bundle = Bundle()
//            bundle.putString(BUNDLE_GALLERY_INFO,"Greetings from custom1")
//            root.findNavController().navigate(R.id.action_nav_custom1_to_nav_gallery)
//        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}