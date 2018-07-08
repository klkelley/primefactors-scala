name := "primefactor"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= {
  val scalatestversion = "3.0.5"
  Seq("org.scalatest" %% "scalatest" % scalatestversion % Test)
}