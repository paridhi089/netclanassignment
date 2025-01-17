import org.gradle.kotlin.dsl.maven

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven{setUrl("https://jitpack.io")}
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "NetclanAssignment"
include(":app")
 