package com.example.familygallery.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.familygallery.R
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    //Initialize buttons to handle user actions
    val btn_add_members = mainBinding.add_members
    val btn_view_members = mainBinding.view_members
    val btn_edit_members = mainBinding.edit_members

    //Set actions to perform upon click

}
