package com.sunaa.two.di

import com.sunaa.two.navigation.FeatureTwo
import com.sunaa.two.navigation.FeatureTwoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object TwoModule {

    @Provides
    fun provideTwoFeature( ) : FeatureTwo{
        return FeatureTwoImpl()
    }
}