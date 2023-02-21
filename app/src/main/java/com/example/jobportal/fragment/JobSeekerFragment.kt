package com.example.jobportal.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.example.jobportal.R
import com.example.jobportal.databinding.FragmentJobSeekerBinding


class JobSeekerFragment : Fragment() {

    private lateinit var binding:FragmentJobSeekerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_job_seeker, container, false)

        binding.personalCard.setOnClickListener {
            if(binding.personalDetails.isVisible){
                binding.personalEt.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.baseline_keyboard_arrow_down_24, 0);
                binding.personalDetails.visibility=View.GONE
            }else{
                binding.personalEt.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.baseline_keyboard_arrow_up_24, 0);
                binding.personalDetails.visibility=View.VISIBLE
            }
        }

        binding.educationCard.setOnClickListener {
            if(binding.educationDetails.isVisible){
                binding.educationEt.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.baseline_keyboard_arrow_down_24, 0);
                binding.educationDetails.visibility=View.GONE
            }else{
                binding.educationEt.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.baseline_keyboard_arrow_up_24, 0);
                binding.educationDetails.visibility=View.VISIBLE
            }
        }

        binding.educationCard.setOnClickListener {
            if(binding.educationDetails.isVisible){
                binding.educationEt.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.baseline_keyboard_arrow_down_24, 0);
                binding.educationDetails.visibility=View.GONE
            }else{
                binding.educationEt.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.baseline_keyboard_arrow_up_24, 0);
                binding.educationDetails.visibility=View.VISIBLE
            }
        }

        return binding.root
    }



}