lazy val buildSettings = Seq(
  scalaVersion := "2.11.8"
)

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(buildSettings: _*)
  .settings(
    name := "moment-utc-offset-failure-demo"
  )
  .settings(
    libraryDependencies += "io.github.widok" %%% "scala-js-momentjs" % "0.1.5"
  )
