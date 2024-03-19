/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.6/samples
 */
plugins { 
    java
}

tasks.jar {
    manifest {
        attributes(mapOf("Main-Class" to "src.main.java.com.program.Hello"))
    }
}

repositories{
    mavenCentral()
}

dependencies{
    "testImplmentation group" to "junit"
    "name" to "junit"
    "version" to "4.13.2"
}