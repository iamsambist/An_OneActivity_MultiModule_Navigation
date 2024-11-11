package com.sunaa.two.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sunaa.common.navigation.Dest
import com.sunaa.common.navigation.Feature
import com.sunaa.common.navigation.SubGraphDest
import com.sunaa.two.ScreenTwo

interface FeatureTwo : Feature {
}

class FeatureTwoImpl : FeatureTwo {
    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation<SubGraphDest.FeatureTwo>(startDestination = Dest.ScreenTwo) {
            composable<Dest.ScreenTwo> {
                ScreenTwo {
                    navHostController.navigate(Dest.ScreenOne)
                }
            }
        }
    }

}