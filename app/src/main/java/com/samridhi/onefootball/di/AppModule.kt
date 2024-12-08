package com.samridhi.onefootball.di

import com.google.gson.GsonBuilder
import com.samridhi.onefootball.data.api.OneFootBallApi
import com.samridhi.ufmsports.util.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
 object AppModule {
     @Singleton
     @Provides
      fun provideSportsApi() : OneFootBallApi =
          Retrofit.Builder()
              .baseUrl(Constant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                .build()
                .create(OneFootBallApi::class.java)
    }
