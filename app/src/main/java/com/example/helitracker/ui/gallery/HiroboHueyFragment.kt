package com.example.helitracker.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.helitracker.databinding.FragmentHirobohueyBinding
import com.example.helitracker.ui.Custom1Fragment

class HiroboHueyFragment : Fragment() {

    private var _binding: FragmentHirobohueyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHirobohueyBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val textView: TextView = binding.textGallery
        //textView.text = "this is the galleryfrag"

        //val message = arguments?.getString(Custom1Fragment.BUNDLE_GALLERY_INFO)
        //textView.text = "This is the gallery frag \n$message"
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}