package com.sunaa.oneactivitynavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.sunaa.common.navigation.SubGraphDest

@Composable
fun MainNavigationScreen(defaultNavigator: DefaultNavigator) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = SubGraphDest.FeatureOne
    ) {
        // this is our main NavGraph Builder register small subgraph here
        defaultNavigator.feature.registerGraph(navController,this )
        defaultNavigator.featureTwo.registerGraph(navController,this)
    }
}