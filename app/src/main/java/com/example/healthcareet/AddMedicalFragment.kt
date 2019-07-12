package com.example.healthcareet


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.healthcareet.data.Medical
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.fragment_add_medical.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */

class AddMedicalFragment : Fragment() {

    private lateinit var saveButton: Button
    private lateinit var first:TextInputEditText
    private lateinit var last:EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_add_medical, container, false)

//        saveButton = save_button
//        first =firstN
//        last = lastN
//
//
//
//        saveButton.setOnClickListener {
//
//            val medical = readFeilds()
//            val replyMedicalIntent = Intent()
//            replyMedicalIntent.putExtra("medical_database",medical)
//            setResult(Activity.RESULT_OK, replyMedicalIntent)
//            finish()
//
//        }
    }


}
