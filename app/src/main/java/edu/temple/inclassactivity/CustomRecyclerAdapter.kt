package edu.temple.inclassactivity

import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CustomRecyclerAdapter(private val items: IntArray) : RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(val imageView: ImageView) : ViewHolder(imageView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MyViewHolder(ImageView(parent.context).apply {
            layoutParams = ViewGroup.LayoutParams(450, 450)
            setPadding(20, 0, 20, 0)
            scaleType = ImageView.ScaleType.CENTER_CROP  // Ensure proper image scaling
        })


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) =
        holder.imageView.setImageResource(items[position])

    override fun getItemCount() = items.size

}