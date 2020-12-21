plugins {
    kotlin("js") version "1.4.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

kotlin {
    js(IR) {
        binaries.executable()
        browser()
    }
}

