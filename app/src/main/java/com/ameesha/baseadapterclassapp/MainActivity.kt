package com.ameesha.baseadapterclassapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ameesha.baseadapterclassapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var baseAdapterClass:baseAdapterClass
    lateinit var binding: ActivityMainBinding
    var studentList = mutableListOf<StudentDataclass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView (binding.root)
        baseAdapterClass =baseAdapterClass(studentList)
        binding.ListView.adapter = baseAdapterClass
        studentList.add(StudentDataclass(1, "Ameesha"))
        studentList.add(StudentDataclass(2, "Anuj"))
        studentList.add(StudentDataclass(2, "Rohan"))
        binding.ListView.setOnItemClickListener { adapter, view, position, id ->
            System.out.println("position $position id $id")
            studentList.removeAt(position)
            baseAdapterClass.notifyDataSetChanged()
        }
    }
}


