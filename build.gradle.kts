
plugins {
    kotlin("js") version "1.4-M1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("http://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
}

dependencies {
//    compile("org.jetbrains.kotlinx:kotlinx-serialization-runtime")
    implementation(kotlin("stdlib-js"))
}

kotlin {
    target {
//        useCommonJs()  // this produces incompatible code
        // both targets are needed to produce working code
        produceExecutable()
        nodejs { }
    }
}

