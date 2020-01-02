import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := ".",
    libraryDependencies += scalaTest % Test
  )

lazy val letsLearnAlgorithm1 = (project in file("lets-learn-algorithm-1"))
  .settings(
    name := "letsLearnAlgorithm1",
    libraryDependencies += scalaTest % Test
  )
