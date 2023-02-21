package com.example.jobportal.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.jobportal.R
import com.example.jobportal.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private lateinit var binding:FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, container, false)

        binding.cardView.setOnClickListener {
            loadFragment(JobSeekerFragment())
        }

        binding.cardView2.setOnClickListener {
            loadFragment(RecruiterSignUpFragment())
        }

        return binding.root
    }

    private fun loadFragment(fragment: Fragment) {
        fragmentManager
            ?.beginTransaction()
            ?.replace(R.id.frameLayout, fragment)
            ?.addToBackStack(null)
            ?.commit()
    }



}