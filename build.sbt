val dottyVersion = dottyLatestNightlyBuild.get

lazy val root = project
  .in(file("."))
  .settings(
    name := "extensionsTest",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    scalacOptions += "-source:3.1",

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
