ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "scala-ci-cd"
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"