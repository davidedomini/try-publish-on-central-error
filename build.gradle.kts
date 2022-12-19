plugins {
    kotlin("jvm") version "1.5.31"
    id("org.danilopianini.publish-on-central") version "2.0.11"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}