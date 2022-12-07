package com.example.designpatterns.feature.feature1.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.designpatterns.data.repository.PatternRepository
import com.example.designpatterns.databinding.FragmentPatternDetailsBinding
import com.example.designpatterns.feature.feature1.viewmodel.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PatternDetailsFragment : Fragment() {
    private lateinit var binding: FragmentPatternDetailsBinding
    private val viewModel: SharedViewModel by activityViewModels()

    @Inject
    lateinit var glide: RequestManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentPatternDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = viewModel.pattern?.title

        viewModel.pattern?.let { pattern ->
            binding.tvIntent.text = pattern.intent
            binding.tvProblem.text = pattern.problem
            binding.tvDiscussion.text = pattern.discussion
            binding.tvStructure.text = pattern.structure.text
            glide.load(pattern.structure.image).into(binding.ivStructure)
            binding.tvExample.text = pattern.example.text
            glide.load(pattern.example.image).into(binding.ivExample)
            binding.tvCheckList.text = pattern.checkList
            binding.tvRulesOfThumb.text = pattern.rulesOfThumb
        }
    }
}