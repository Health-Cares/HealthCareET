package com.example.healthcareet


import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.healthcareet.data.Medical
import com.example.healthcareet.databinding.FragmentHomeBinding
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.fragment_add_medical.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HomeFragment : Fragment() {

    private lateinit var saveButton: Button
    private lateinit var first: TextInputEditText
    private lateinit var last: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val options = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }
        view.findViewById<Button>(R.id.child_button)?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_childFragment, null, options)
        }
        val options1 = navOptions {
            anim {
                enter = R.anim.fade_in
                exit = R.anim.fade_out
                popEnter = R.anim.fade_in
                popExit = R.anim.fade_out
            }
        }
        view.findViewById<Button>(R.id.add_button)?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_addMedicalFragment, null, options1)
        }
        val options2 = navOptions {
            anim {
                enter = R.anim.slide_in_left
                exit = R.anim.slide_out_right
                popEnter = R.anim.slide_in_right
                popExit = R.anim.slide_out_left
            }
        }
        view.findViewById<Button>(R.id.treat_button)?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_treatFragment, null, options2)
        }
        val options3 = navOptions {
            anim {
                enter = R.anim.slide_in_left
                exit = R.anim.slide_out_right
                popEnter = R.anim.slide_in_right
                popExit = R.anim.slide_out_left
            }
        }
        view.findViewById<Button>(R.id.contactus_button)?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_contactUsFragment, null, options3)
        }
    }


}