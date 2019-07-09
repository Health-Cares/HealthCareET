package com.example.healthcareet


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
class TreatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_treat, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageButton = view.findViewById<ImageButton>(R.id.toothache_image_button)
        imageButton?.setOnClickListener {
            findNavController().navigate(R.id.action_treatFragment_to_toothacheFragment)
        }
        val imageButtonH = view.findViewById<ImageButton>(R.id.headache_image_button)
        imageButtonH?.setOnClickListener {
            findNavController().navigate(R.id.action_treatFragment_to_headacheFragment)
        }
        val imageButtonM = view.findViewById<ImageButton>(R.id.muscle_image_button)
        imageButtonM?.setOnClickListener {
            findNavController().navigate(R.id.action_treatFragment_to_muscleFragment)
        }
        val imageButtonCo = view.findViewById<ImageButton>(R.id.common_image_button)
        imageButtonCo?.setOnClickListener {
            findNavController().navigate(R.id.action_treatFragment_to_commonFragment)
        }
        val imageButtonA = view.findViewById<ImageButton>(R.id.asthma_image_button)
        imageButtonA?.setOnClickListener {
            findNavController().navigate(R.id.action_treatFragment_to_asthemaFragment)
        }
        val imageButtonHe = view.findViewById<ImageButton>(R.id.heart_image_button)
        imageButtonHe?.setOnClickListener {
            findNavController().navigate(R.id.action_treatFragment_to_heartFragment)
        }
    }


}
