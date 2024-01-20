package com.example.alena6.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.alena6.R
import com.example.alena6.databinding.ActivityMainBinding
import com.example.alena6.magazine.domen.model.ItemModel
import com.example.alena6.magazine.domen.model.itemModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.сontainer_view) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavigationView?.setupWithNavController(navController)
        itemModel.add(ItemModel(R.drawable.photo_pechat, "Фотопечать"))
        itemModel.add(ItemModel(R.drawable.pechat_na_suvenirah, "Печать на сувенирах"))
        itemModel.add(ItemModel(R.drawable.pechat_poligraf, "Печать полиграфии"))
        itemModel.add(ItemModel(R.drawable.pechat_document, "Печать документов"))
        itemModel.add(ItemModel(R.drawable.order, "Произвольный заказ"))
    }
}