name := "meta-meta"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
  "org.scalameta" %% "scalameta" % "1.6.0"
)


addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M7" cross CrossVersion.full)

scalacOptions += "-Xplugin-require:macroparadise"


lazy val macros = project in file("macros")

lazy val example = (project in file("example")).dependsOn(macros)

lazy val root = (project in file(".")).dependsOn(macros, example)
