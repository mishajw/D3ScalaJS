name := "D3ScalaJS"

version := "1.0"

scalaVersion := "2.11.8"

enablePlugins(ScalaJSPlugin)

scalaJSUseRhino in Global := false

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0"
)
