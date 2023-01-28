package com.example.service_operator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.service_operator.databinding.ItemLargeNewsBinding

class NewsAdapter(
    private val largeNewsList: List<LargeNews>
) : RecyclerView.Adapter<NewsAdapter.LargeNewsViewHolder>() {

    class LargeNewsViewHolder(
        private val binding: ItemLargeNewsBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(largeNews: LargeNews) {
            binding.largeNews = largeNews
        }
    }

    private lateinit var binding: ItemLargeNewsBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LargeNewsViewHolder {
        binding = ItemLargeNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LargeNewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LargeNewsViewHolder, position: Int) {
        val largeNews = largeNewsList[position]
        holder.bind(largeNews)
    }

    override fun getItemCount(): Int = largeNewsList.size

}
