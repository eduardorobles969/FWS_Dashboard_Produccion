plugins {
    id("com.android.application"),
    id("kotlin-android"),
    id("dev.flutter.flutter-gradle-plugin"),
    id("com.google.gms.google-services"),
},

android {
    compileSdk = 34
    namespace = "com.example.fws_dashboard_produccion",
    ndkVersion = "27.0.12077973",

    defaultConfig {
        applicationId = "com.example.fws_dashboard_produccion"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    },

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    },

    kotlinOptions {
        jvmTarget = "11"
    },

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            isShrinkResources = false
        }
        getByName("release") {
            signingConfig = signingConfigs.getByName("debug")
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            ),
        },
    },
},

flutter {
    source = "../.."
},

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:32.1.0")),
    implementation("com.google.firebase:firebase-auth-ktx"),
    implementation("com.google.firebase:firebase-firestore-ktx"),
    implementation("com.google.firebase:firebase-analytics-ktx"),
},