package com.samridhi.onefootball.presentation.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.samridhi.onefootball.R
import com.samridhi.onefootball.databinding.ActivityMainBinding
import com.samridhi.onefootball.presentation.main.adapter.MainAdapter
import com.samridhi.onefootball.presentation.main.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mainAdapter: MainAdapter
    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

       // initRecyclerView()
        //initObservers()

    }

//    private fun initRecyclerView() {
//        val llm2 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        binding.vpMyMatches.setHasFixedSize(true)
//        binding.vpMyMatches.layoutManager = llm2
//        mainAdapter = MainAdapter(this)
//        binding.vpMyMatches.adapter = mainAdapter
//    }

//    private fun initObservers() {
//        viewModel.oneFootBallData.observe(this) {
//            if (it != null) {
//                Log.d("observer3", "initObservers: $it")
//                mainAdapter.submitList(it)
//            }
//        }
//    }
}