package com.example.recyclerviews.adapter

import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviews.holder.WriterListViewHolder
import com.example.recyclerviews.model.WriterModel


/**     Code with ❤
╔════════════════════════════╗
║  Created by Burakcan SEZGIN║
╠════════════════════════════╣
║ brkcnszgn@gmail.com        ║
╠════════════════════════════╣
║     22/02/2020 - 20:12     ║
╚════════════════════════════╝
 */

class Adapter(val writerList: List<WriterModel>) : RecyclerView.Adapter<WriterListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WriterListViewHolder {
        return WriterListViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return writerList.size

    }

    override fun onBindViewHolder(holder: WriterListViewHolder, position: Int) {
        holder.bind(writerList[position])

        Log.e("Adapter", "$position")
    }
}