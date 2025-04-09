// build.gradle.kts (niveau projet)

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

buildscript {
    dependencies {
        // Change the AGP version to 8.5.0
        classpath("com.android.tools.build:gradle:8.5.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")
    }
}


allprojects {
    // Tu peux laisser cette section vide si tu utilises `settings.gradle.kts` pour gérer les dépôts
}
