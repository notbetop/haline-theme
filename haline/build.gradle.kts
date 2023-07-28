plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "top.notbe"
version = "0.1-dev01"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    jvm()
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
                implementation(compose.desktop.common) {
                    // 移除 material
                    exclude("org.jetbrains.compose.material")
                }
            }
        }
        val jvmTest by getting
    }
}