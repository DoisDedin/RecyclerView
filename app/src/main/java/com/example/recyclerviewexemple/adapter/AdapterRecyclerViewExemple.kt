package com.example.recyclerviewexemple.adapter


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.recyclerviewexemple.databinding.LayoutRecyclerViewBinding

class AdapterRecyclerViewExemple() :
    RecyclerView.Adapter<AdapterRecyclerViewExemple.ViewHolderRecyclerViewExemple>() {


    private var imageList: MutableList<Pair<String, String>> = arrayListOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolderRecyclerViewExemple {
        val itemBinding = LayoutRecyclerViewBinding.inflate(
            LayoutInflater.from(parent.context)
        )
        return ViewHolderRecyclerViewExemple(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolderRecyclerViewExemple, position: Int) {
        holder.onBind(imageList[position])
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(notifications: List<Pair<String, String>>) {
        imageList.clear()
        imageList.addAll(notifications)
        notifyDataSetChanged()
    }

    class ViewHolderRecyclerViewExemple(val layout: LayoutRecyclerViewBinding) :
        RecyclerView.ViewHolder(layout.root) {
        fun onBind(imageInfo: Pair<String, String>) {
            layout.textviewNameImage.text = imageInfo.first
            layout.imageviewImage.load(imageInfo.second)
        }
    }
}