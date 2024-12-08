package com.samridhi.onefootball.data.repository

import com.samridhi.onefootball.data.api.OneFootBallApi
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val api: OneFootBallApi
) {
    suspend fun getSportsData() = api.getSportsData()

}
