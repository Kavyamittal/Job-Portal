package com.example.jobportal.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.jobportal.R
import com.example.jobportal.activity.LoginActivity
import com.example.jobportal.databinding.FragmentRecruiterSignUpBinding

class RecruiterSignUpFragment : Fragment() {

    private lateinit var binding:FragmentRecruiterSignUpBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recruiter_sign_up, container, false)

        binding.firstNameEtLayout.hint = "First Name"
        binding.lastNameEtLayout.hint = "Last Name"
        binding.mobileEtLayout.hint = "Mobile Number"
        binding.emailEtLayout.hint = "Email Id"
        binding.shopNameEtLayout.hint = "Company Name"
        binding.addressEtLayout.hint = "Address"
        binding.cityEtLayout.hint = "City"
        binding.pinCodeEtLayout.hint = "Pin Code"

        binding.loginPage.setOnClickListener {

            startActivity(Intent(requireContext(),LoginActivity::class.java))
            requireActivity().finish()

        }

        return binding.root
    }


}