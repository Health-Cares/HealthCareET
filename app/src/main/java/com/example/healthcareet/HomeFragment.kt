package com.example.healthcareet


import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.healthcareet.data.Medical
import com.example.healthcareet.databinding.FragmentHomeBinding
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


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val button = view.findViewById<Button>(R.id.add_button)
//        button?.setOnClickListener {
//            findNavController().navigate(R.id.action_homeFragment_to_addMedicalFragment)
//        }
//        val buttonC = view.findViewById<Button>(R.id.child_button)
//        buttonC?.setOnClickListener {
//            findNavController().navigate(R.id.action_homeFragment_to_childFragment)
//        }
        val buttonT = view.findViewById<Button>(R.id.treat_button)
        buttonT?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_treatFragment)
        }
        val buttonCo = view.findViewById<Button>(R.id.contactus_button)
        buttonCo?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_contactUsFragment)
        }
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
    }


}