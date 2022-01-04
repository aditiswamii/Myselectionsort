package com.example.myselectionsort

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv1:TextView
    lateinit var tv2:TextView
    lateinit var tv3:TextView
    lateinit var tv4:TextView
    lateinit var tv5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv1=findViewById<TextView>(R.id.tv1)
         tv2=findViewById<TextView>(R.id.tv2)
         tv3=findViewById<TextView>(R.id.tv3)
         tv4=findViewById<TextView>(R.id.tv4)
         tv5=findViewById<TextView>(R.id.tv5)
    }
    private fun selectionSort(array: Array<String>) {
        val size = array.size
        for (step in 0 until size - 1) {
            var min_idx = step
            for (i in step + 1 until size) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[i] < array[min_idx]) {
                    min_idx = i
                }
            }

            // put min at the correct position
            val temp = array[step]
            array[step] = array[min_idx]
            array[min_idx] = temp
        }
    }

    // driver code
    fun main(args: Array<String>) {
        val data = arrayOf<String>("${tv1.text}","${tv2.text}" ,"${tv3.text}",
            "${ tv4.text }", "${ tv5.text}" )
        val ss = MainActivity()
        ss.selectionSort(data)
        println("Sorted Array in Ascending Order: ")
        println(data.contentToString())
    }
}