package com.sunaa.one.di

import com.sunaa.one.navigation.OneFeature
import com.sunaa.one.navigation.OneFeatureImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object OneModule {

    @Provides
    fun provideFeatureOne(): OneFeature {
        return OneFeatureImp()
    }
}