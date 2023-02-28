package com.example.myportfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myportfolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )

        binding.btnInsta.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/wsiwsiwsi123/"))
            startActivity(browserIntent)
        }

        binding.tvInsta.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/wsiwsiwsi123/"))
            startActivity(browserIntent)
        }

        binding.btnGithub.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/wsi1212/"))
            startActivity(browserIntent)
        }

        binding.tvGithub.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/wsi1212/"))
            startActivity(browserIntent)
        }

        binding.tvNotion.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/9fd7e00ba1154cb1860551f7683b597c?pvs=4"))
            startActivity(browserIntent)
        }

        binding.icNotion.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/9fd7e00ba1154cb1860551f7683b597c?pvs=4"))
            startActivity(browserIntent)
        }
    }
}