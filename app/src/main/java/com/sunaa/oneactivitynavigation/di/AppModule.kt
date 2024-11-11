package com.sunaa.oneactivitynavigation.di

import com.sunaa.one.navigation.OneFeature
import com.sunaa.oneactivitynavigation.DefaultNavigator
import com.sunaa.two.navigation.FeatureTwo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideDeafultNavigator(feature: OneFeature, featureTwo: FeatureTwo): DefaultNavigator {
        return DefaultNavigator(feature, featureTwo)
    }
}