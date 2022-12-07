package com.example.designpatterns.feature.feature1.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.designpatterns.databinding.PatternListItemBinding
import com.example.designpatterns.feature.feature1.model.PatternInfo

class PatternsAdapter : RecyclerView.Adapter<PatternsAdapter.PatternsViewHolder>() {

    private val patterns = mutableListOf<PatternInfo>()

    inner class PatternsViewHolder(val binding: PatternListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatternsViewHolder {
        return PatternsViewHolder(PatternListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PatternsViewHolder, position: Int) {
        val pattern = patterns[position]
        holder.itemView.apply {
            holder.binding.patternNumber.text = pattern.id.toString()
            holder.binding.patternName.text = pattern.title

            setOnClickListener {
                onItemClickListener?.let { click ->
                    click(pattern)
                }
            }
        }
    }

    override fun getItemCount() = patterns.size

    private var onItemClickListener: ((PatternInfo) -> Unit)? = null

    fun setItemClickListener(listener: (PatternInfo) -> Unit) {
        onItemClickListener = listener
    }

    fun addToPatterns(patterns: MutableList<PatternInfo>) {
        this.patterns.clear()
        this.patterns.addAll(patterns)
        notifyDataSetChanged()
    }
}