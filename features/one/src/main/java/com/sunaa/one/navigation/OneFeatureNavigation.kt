package com.sunaa.one.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sunaa.common.navigation.Dest
import com.sunaa.common.navigation.Feature
import com.sunaa.common.navigation.SubGraphDest
import com.sunaa.one.ScreenOne

interface OneFeature : Feature

class OneFeatureImp : OneFeature{
    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        // here we create our navigation sub graph through navGraphBuilder
        navGraphBuilder.navigation<SubGraphDest.FeatureOne>(startDestination = Dest.ScreenOne){
            composable<Dest.ScreenOne> {
                ScreenOne{
                    navHostController.navigate(Dest.ScreenTwo)
                }
            }
        }
    }

}