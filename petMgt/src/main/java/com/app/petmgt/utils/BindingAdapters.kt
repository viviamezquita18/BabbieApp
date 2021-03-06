package com.app.petmgt.utils


import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.app.base.model.network.petMgt.Pet
import com.app.petmgt.R

import com.app.petmgt.pets.adapters.PetAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<Pet>?) {
    val adapter = recyclerView.adapter as PetAdapter
    if (data != null) {
        adapter.setData(data)
    }
}

@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {

    imgUrl?.let {
        val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
        Glide.with(imgView.context)
            .load(imgUri)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.loading_animation)
                    .error(R.drawable.pet_bottle)
            )
            .into(imgView)
    }
}


