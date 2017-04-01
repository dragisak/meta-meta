name := "meta-meta"

val setting = Seq(
  version := "1.0",

  scalaVersion := "2.11.8",

  resolvers += Resolver.sonatypeRepo("releases"),

  libraryDependencies ++= Seq(
    "org.scalameta" %% "scalameta" % "1.6.0"
  ),

  scalacOptions += "-Xplugin-require:macroparadise",

  addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M7" cross CrossVersion.full)

)

lazy val macros = (project in file("macros")).settings(setting)

lazy val example = (project in file("example")).dependsOn(macros).settings(setting)

lazy val root = (project in file(".")).dependsOn(macros, example).settings(setting)

