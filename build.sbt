name := "dfdl-image-stats"
organization := "com.ctc"
scalaVersion := "2.12.11"
git.useGitDescribe := true

dependsOn(ProjectRef(uri("git://github.com/DFDLSchemas/JPEG.git"), "jpeg"))

libraryDependencies ++= {
  Seq(
    "com.iheart" %% "ficus" % "1.4.0",
    "org.apache.daffodil" %% "daffodil-sapi" % "latest.integration",
    "com.typesafe.akka" %% "akka-actor-typed" % "2.6.5",
    "com.typesafe.akka" %% "akka-stream" % "2.6.5",
    "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.12",
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
  )
}
