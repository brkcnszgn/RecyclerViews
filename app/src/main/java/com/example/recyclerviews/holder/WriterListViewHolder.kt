package com.example.recyclerviews.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviews.R
import com.example.recyclerviews.model.WriterModel


/**     Code with ❤
╔════════════════════════════╗
║  Created by Burakcan SEZGIN  ║
╠════════════════════════════╣
║ brkcnszgn@gmail.com ║
╠════════════════════════════╣
║     22/02/2020 - 20:02     ║
╚════════════════════════════╝
 */
//Adapterlarda viewGropu'un context'i burada kullanılabilir ekstradan tekrar context'e gerek kalmaz

class WriterListViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(
        R.layout.row_item_layout,
        container,
        false
    )
) {

    val imageView = itemView.findViewById<ImageView>(R.id.imageView)
    val name = itemView.findViewById<TextView>(R.id.name)
    val surname = itemView.findViewById<TextView>(R.id.surname)
    val email = itemView.findViewById<TextView>(R.id.email)


    fun bind(writerModel: WriterModel) {

        name.text = writerModel.name
        surname.text = writerModel.surname
        email.text = writerModel.email


    }
}


