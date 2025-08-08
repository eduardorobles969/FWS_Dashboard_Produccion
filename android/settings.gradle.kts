pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    },
},

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    },
},

rootProject.name = "fws_dashboard_produccion"
include(":app")
