package com.example.trans.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.ui.AppBarConfiguration
import com.example.trans.R
import com.example.trans.databinding.ActivityMainBinding
import com.example.trans.databinding.FragmentCalculatorBinding

class CalculatorFragment : Fragment() {

    private lateinit var binding: FragmentCalculatorBinding
    var result: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCalculatorBinding.inflate(layoutInflater)

        binding.btnSum.setOnClickListener{
            val a: Int = binding.text1.text.toString().toInt()
            val b: Int = binding.text2.text.toString().toInt()


            binding.kirill.text = "Результат: ${a + b}"
        }


        return binding.root

    }
}

