
ThisBuild / bazelScalaRulesVersion := "0f89c210ade8f4320017daf718a61de3c1ac4773"

bazelWorkspaceGenerate := true

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
	"org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.1",
	"org.yaml" % "snakeyaml" % "1.15"
)

scalaSource in Compile := baseDirectory.value / "source"

sourcesInBase := false

// 143 chars is the filename length limit in eCryptfs, commonly used in linux distros to encrypt homedirs.
// Make scala respect that limit via max-classfile-name, or compilation fails.
scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xmax-classfile-name", "143")

libraryDependencies += "com.github.scopt" %% "scopt" % "3.2.0"

//Seq(SbtStartScript.startScriptForClassesSettings: _*)
