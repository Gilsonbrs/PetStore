plugins {
    id("java")
}

group = "br.com.iterasys"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.12.0")
    testImplementation("io.rest-assured:rest-assured:6.0.1")
}

tasks.test {
    useTestNG()
}