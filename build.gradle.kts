// build.gradle.kts (niveau projet)

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        // Dépendances classpath en Kotlin DSL
        classpath("com.android.tools.build:gradle:8.6.0")  // Mise à jour à 8.6.0 ou supérieur
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")  // Vérifier la version de Kotlin
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
