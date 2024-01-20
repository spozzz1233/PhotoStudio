package com.example.alena6.magazine.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.alena6.R
import com.example.alena6.magazine.domen.model.ItemModel
import com.example.alena6.magazine.domen.model.itemModel

class MagazineFragmentAdapter(
    private val clickListener: Click
): RecyclerView.Adapter<MagazineFragmentAdapter.MagazineFragmentViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MagazineFragmentAdapter.MagazineFragmentViewHolder {
        val cardMusicView = LayoutInflater.from(parent.context).inflate(R.layout.card_magazine, parent, false)
        return MagazineFragmentViewHolder(cardMusicView)
    }

    override fun getItemCount(): Int = itemModel.size

    override fun onBindViewHolder(holder: MagazineFragmentViewHolder, position: Int) {
        holder.bind(itemModel[position])
        val track = itemModel[position]

    }
    class MagazineFragmentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val textView: TextView = itemView.findViewById(R.id.textView)

        fun bind(item: ItemModel) {
            textView.text = item.title
            Glide.with(itemView.context)
                .load(item.photoUrl)
                .transform(RoundedCorners(8))
                .into(imageView)
        }
    }
    fun interface Click {
        fun onClick(item: ItemModel)
    }


}

