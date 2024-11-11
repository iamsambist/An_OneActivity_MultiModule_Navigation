package com.sunaa.common.navigation

import kotlinx.serialization.Serializable

sealed class SubGraphDest {
    @Serializable
    data object FeatureOne : SubGraphDest()
    @Serializable
    data object FeatureTwo : SubGraphDest()
    @Serializable
    data object FeatureThree : SubGraphDest()
}

sealed class Dest {
    @Serializable
    data object ScreenOne : Dest()

    @Serializable
    data object ScreenTwo : Dest()

    @Serializable
    data object ScreenThree : Dest()
}