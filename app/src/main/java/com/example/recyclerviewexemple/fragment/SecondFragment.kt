package com.example.recyclerviewexemple.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexemple.R
import com.example.recyclerviewexemple.adapter.AdapterRecyclerViewExemple
import com.example.recyclerviewexemple.databinding.FragmentSecondBinding
import java.util.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var adapterRecyclerView : AdapterRecyclerViewExemple
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }


        startAdapter()
        setDataInAdapter()
    }

    private fun setDataInAdapter() {
        adapterRecyclerView.setData(myListUrls())
    }

    private fun startAdapter() {
        binding.recyclerviewExemple.apply {
            adapterRecyclerView = AdapterRecyclerViewExemple()
            layoutManager = GridLayoutManager(context, 3)
            adapter = adapterRecyclerView
        }

//        binding.recyclerviewExemple.apply {
   //     adapterRecyclerView = AdapterRecyclerViewExemple()
//            layoutManager = LinearLayoutManager(context)
//                 adapter = adapterRecyclerView
//        }
//

//        binding.recyclerviewExemple.apply {
     //   adapterRecyclerView = AdapterRecyclerViewExemple()
//            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//                 adapter = adapterRecyclerView
//        }
    }


    fun myListUrls(): List<Pair<String, String>> = listOf(
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        ),
        Pair(
            "https://picsum.photos/id/${rand(0, 100)}/200/300",
            "https://picsum.photos/id/${rand(0, 100)}/200/300"
        )
    )

    fun rand(from: Int, to: Int): Int {
        val random = Random()
        return random.nextInt(to - from) + from
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}