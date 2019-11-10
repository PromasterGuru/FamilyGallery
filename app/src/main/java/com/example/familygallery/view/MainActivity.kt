package com.example.familygallery.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.familygallery.R
import com.example.familygallery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainBinding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main) as ActivityMainBinding

        //Set actions to perform upon click
        mainBinding.addMembers.setOnClickListener{
            val intent = Intent(this, AddMembersActivity::class.java)
            startActivity(intent)
            
        }
        mainBinding.viewMembers.setOnClickListener{
            val intent = Intent(this, ViewMembersActivity::class.java)
            startActivity(intent)
        }
        mainBinding.editMembers.setOnClickListener{
            val intent = Intent(this, EditMembersActivity::class.java)
            startActivity(intent)
        }
    }


}
