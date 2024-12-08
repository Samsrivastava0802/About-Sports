package com.samridhi.onefootball.data.api

import com.samridhi.onefootball.data.AppData
import retrofit2.Response
import retrofit2.http.GET

interface OneFootBallApi {
    @GET("hosting_api/sports.json")
        suspend fun getSportsData(
        ):Response<AppData>

}