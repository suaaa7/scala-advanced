lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.12.7",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "root"
  )

lazy val sbt02 = (project in file("02")).
  settings(commonSettings: _*).
  settings(
    name := "02"
  )

lazy val sbt04 = (project in file("04")).
  settings(commonSettings: _*).
  settings(
    name := "04"
  )

lazy val sbt08 = (project in file("08")).
  settings(commonSettings: _*).
  settings(
    name := "08"
  )

lazy val sbt11 = (project in file("11")).
  settings(commonSettings: _*).
  settings(
    name := "11"
 )

