// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    // id("com.android.application")
    //id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt") version "1.9.20" apply false
    alias(libs.plugins.google.gms.google.services) apply false // Add this line
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.0") // Or your current AGP version
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20") // Or your current Kotlin version
// Add other classpath dependencies here if needed
    }
}


tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}