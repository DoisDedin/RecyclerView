package com.example.recyclerviewexemple.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.recyclerviewexemple.R
import com.example.recyclerviewexemple.databinding.FragmentFirstBinding
import java.sql.Time
import java.util.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        binding.imageviewFirst.load("https://picsum.photos/id/${rand(0, 100)}/200/300")
    }

    fun rand(from: Int, to: Int): Int {
        val random = Random()
        return random.nextInt(to - from) + from
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}