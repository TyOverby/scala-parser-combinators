scalaJSSettings

name                       := "scalajs-parser-combinators"

version                    := "1.0.0-SNAPSHOT"

organization               := "org.scalajs"

scalaVersion               := "2.11.0-M8"

// needed to fix classloader issues (see scala-xml#20)
fork in Test := true

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10" % "test"
