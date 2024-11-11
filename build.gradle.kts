// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google() // Include Google Maven repository
        mavenCentral() // Include Maven Central repository
    }
    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.52")// Hilt Plugin
    }
}
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.0" apply false
}