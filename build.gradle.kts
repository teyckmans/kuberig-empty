/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds/
 */
repositories {
  jcenter()
}

plugins {
  id("io.kuberig.kuberig")
}

kuberig {
  kubernetes("v1.16.6")
}
