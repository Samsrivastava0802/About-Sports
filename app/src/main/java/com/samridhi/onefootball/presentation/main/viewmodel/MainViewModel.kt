package com.samridhi.onefootball.presentation.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.samridhi.onefootball.data.AppData
import com.samridhi.onefootball.data.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: MainRepository
) : ViewModel() {

    private val _oneFootBallData: MutableLiveData<AppData> = MutableLiveData()

    val oneFootBallData: LiveData<AppData> get() = _oneFootBallData

    init {
        getAllSportsData()
    }
    private fun getAllSportsData() {
        viewModelScope.launch {
            val result = repository.getSportsData()
            _oneFootBallData.value = result
        }
    }
}
