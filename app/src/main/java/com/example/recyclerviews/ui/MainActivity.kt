package com.example.recyclerviews.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviews.R
import com.example.recyclerviews.adapter.Adapter
import com.example.recyclerviews.mock.MockList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // val writerModel : ArrayList<WriterModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView.adapter =
            Adapter(MockList.getMockedWriterList())
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}
