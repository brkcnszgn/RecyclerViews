package com.example.recyclerviews.mock

import com.example.recyclerviews.model.WriterModel


/**     Code with ❤
╔════════════════════════════╗
║  Created by Burakcan SEZGIN  ║
╠════════════════════════════╣
║ brkcnszgn@gmail.com ║
╠════════════════════════════╣
║     22/02/2020 - 21:24     ║
╚════════════════════════════╝
 */

object MockList {
    fun getMockedWriterList(): List<WriterModel> {

        val writerModel = WriterModel(
            "Ayşe",
            "Zaloğlu",
            "ayse@gmail.com",
            "asdasdasd"
        )

        val writeList: ArrayList<WriterModel> = ArrayList()
        //  val writeList1: List<WriterModel> = ArrayList()

        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)


        return writeList
    }
}