package com.example.designpatterns.feature.feature1.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.designpatterns.R
import com.example.designpatterns.base.recyclerview.BaseAdapter
import com.example.designpatterns.databinding.FragmentPatternProvidersBinding
import com.example.designpatterns.databinding.PatternListItemBinding
import com.example.designpatterns.feature.feature1.model.PatternProvider
import com.example.designpatterns.feature.feature1.viewmodel.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PatternProvidersFragment : Fragment() {
    private lateinit var binding: FragmentPatternProvidersBinding
    private val patternProvidersAdapter by lazy { BaseAdapter<PatternProvider>() }
    private val viewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentPatternProvidersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = viewModel.title
        setupRecyclerView()

        val patternProviders = viewModel.patternProviders
        patternProvidersAdapter.listOfItems = patternProviders
        patternProvidersAdapter.expressionOnCreateViewHolder = { viewGroup ->
            PatternListItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        }
        patternProvidersAdapter.expressionOnBindViewHolder = { patternProvider, viewBinding ->
            val view = viewBinding as PatternListItemBinding
            view.patternNumber.text = patternProvider.id.toString()
            view.patternName.text = patternProvider.title

            view.root.setOnClickListener {
                viewModel.patterns.addAll(patternProvider.patterns)
                findNavController().navigate(R.id.action_patternTypesFragment_to_patternsFragment)
            }
        }
    }

    private fun setupRecyclerView() {
        binding.rvPatternProviders.apply {
            adapter = patternProvidersAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }
}