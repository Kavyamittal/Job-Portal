package com.example.jobportal.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jobportal.R
import com.example.jobportal.databinding.ActivityRegisterBinding
import com.example.jobportal.fragment.SignUpFragment

class RegisterActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private lateinit var binding:ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register)

        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout, SignUpFragment())
        fragmentTransaction.commit()

    }



}