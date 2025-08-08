 dependencies {
        classpath("com.android.tools.build:gradle:8.2.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
        classpath("com.google.gms:google-services:4.4.0") // ✅ Firebase plugin version
    },


allprojects {
    repositories {
        google()
        mavenCentral()
    }
},

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
},