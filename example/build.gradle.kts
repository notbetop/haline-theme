import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

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
                implementSkiko()
                implementation(compose.desktop.currentOs){
                    // remove material
                    exclude("org.jetbrains.compose.material")
                }
                implementation(project(":haline"))
            }
        }
        val jvmTest by getting
    }
}

fun KotlinDependencyHandler.implementSkiko(){
    val osName = System.getProperty("os.name")
    val targetOs = when {
        osName == "Mac OS X" -> "macos"
        osName.startsWith("Win") -> "windows"
        osName.startsWith("Linux") -> "linux"
        else -> error("Unsupported OS: $osName")
    }

    val targetArch = when (val osArch = System.getProperty("os.arch")) {
        "x86_64", "amd64" -> "x64"
        "aarch64" -> "arm64"
        else -> error("Unsupported arch: $osArch")
    }

    val version = extra["skiko.version"] as String // or any more recent version
    val target = "${targetOs}-${targetArch}"

    implementation("org.jetbrains.skiko:skiko-awt-runtime-$target:$version")
}
