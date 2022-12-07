package com.example.designpatterns.feature.feature1.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.designpatterns.databinding.PatternListItemBinding
import com.example.designpatterns.feature.feature1.model.PatternProvider

class PatternProvidersAdapter : RecyclerView.Adapter<PatternProvidersAdapter.PatternProvidersViewHolder>() {

    private val patternProviders = mutableListOf<PatternProvider>()

    inner class PatternProvidersViewHolder(val binding: PatternListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatternProvidersViewHolder {
        return PatternProvidersViewHolder(PatternListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PatternProvidersViewHolder, position: Int) {
        val patternProvider = patternProviders[position]
        holder.itemView.apply {
            holder.binding.patternNumber.text = patternProvider.id.toString()
            holder.binding.patternName.text = patternProvider.title

            setOnClickListener {
                onItemClickListener?.let { click ->
                    click(patternProvider)
                }
            }
        }
    }

    override fun getItemCount() = patternProviders.size

    private var onItemClickListener: ((PatternProvider) -> Unit)? = null

    fun setItemClickListener(listener: (PatternProvider) -> Unit) {
        onItemClickListener = listener
    }

    fun addToPatternProviders(patternProviders: MutableList<PatternProvider>) {
        this.patternProviders.clear()
        this.patternProviders.addAll(patternProviders)
        notifyDataSetChanged()
    }
}