package com.example.healthcareet


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ChildFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_child, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageButton = view.findViewById<ImageButton>(R.id.one_image_button)
        imageButton?.setOnClickListener {
            findNavController().navigate(R.id.action_childFragment_to_oneMonthFragment)
       }
        val imageButtonS = view.findViewById<ImageButton>(R.id.six_image_button)
        imageButtonS?.setOnClickListener {
            findNavController().navigate(R.id.action_childFragment_to_sixMonthFragment)
        }
        val imageButtonT = view.findViewById<ImageButton>(R.id.twelve_image_button)
        imageButtonT?.setOnClickListener {
            findNavController().navigate(R.id.action_childFragment_to_twelveMonthFragment)
        }
        val imageButtonA = view.findViewById<ImageButton>(R.id.above_image_button)
        imageButtonA?.setOnClickListener {
            findNavController().navigate(R.id.action_childFragment_to_aboveMonthFragment)
        }
    }




}
