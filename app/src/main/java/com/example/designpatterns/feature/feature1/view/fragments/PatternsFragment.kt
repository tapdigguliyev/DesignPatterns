package com.example.designpatterns.feature.feature1.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.designpatterns.R
import com.example.designpatterns.base.recyclerview.BaseAdapter
import com.example.designpatterns.databinding.FragmentPatternsBinding
import com.example.designpatterns.databinding.PatternListItemBinding
import com.example.designpatterns.feature.feature1.model.PatternInfo
import com.example.designpatterns.feature.feature1.viewmodel.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PatternsFragment : Fragment() {
    private lateinit var binding: FragmentPatternsBinding
    private val patternsAdapter by lazy { BaseAdapter<PatternInfo>() }
    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentPatternsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = viewModel.patternProvider?.title
        setupRecyclerView()

        val patterns = viewModel.patterns
        patternsAdapter.listOfItems = patterns
        patternsAdapter.expressionOnCreateViewHolder = { viewGroup ->
            PatternListItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        }
        patternsAdapter.expressionOnBindViewHolder = { pattern, viewBinding ->
            val view = viewBinding as PatternListItemBinding
            view.patternNumber.text = pattern.id.toString()
            view.patternName.text = pattern.title

            view.root.setOnClickListener {
                viewModel.pattern = pattern
                findNavController().navigate(R.id.action_patternsFragment_to_patternDetailsFragment)
            }
        }

        val backPressedCallback = requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigateUp()
            viewModel.patterns.clear()
            viewModel.patternProvider = null
        }
        backPressedCallback.isEnabled = true
    }

    private fun setupRecyclerView() {
        binding.rvPatterns.apply {
            adapter = patternsAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }
}