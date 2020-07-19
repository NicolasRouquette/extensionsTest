# extensionsTest
Dotty extensions test


```
   [info] welcome to sbt 1.3.13 (AdoptOpenJDK Java 11.0.6)
   [info] loading settings for project global-plugins from dependency-graph.sbt ...
   [info] loading global plugins from /home/rouquette/.sbt/1.0/plugins
   [info] loading settings for project extensionstest-build from plugins.sbt,idea8.sbt ...
   [info] loading project definition from /opt/local/github.dotty/extensionsTest/project
   Fetching latest Dotty nightly version...
   Latest Dotty nightly build version: 0.26.0-bin-20200718-c753ca3-NIGHTLY
   [info] loading settings for project root from build.sbt ...
   [warn] Discarding 1 session setting.  Use 'session save' to persist session settings.
   [info] set current project to extensionsTest (in build file:/opt/local/github.dotty/extensionsTest/)
   [info] Defining Global / sbtStructureOptions
   [info] The new value will be used by Global / ssOptions
   [info] Reapplying settings...
   [info] set current project to extensionsTest (in build file:/opt/local/github.dotty/extensionsTest/)
   [info] Writing structure to /tmp/sbt-structure.xml...
   [info] Done.
   [success] Total time: 1 s, completed Jul 19, 2020, 11:50:45 AM
   [info] Reapplying settings...
   [info] set current project to extensionsTest (in build file:/opt/local/github.dotty/extensionsTest/)
   [info] Defining Global / ideaPort
   [info] The new value will be used by Compile / compile, Test / compile
   [info] Reapplying settings...
   [info] set current project to extensionsTest (in build file:/opt/local/github.dotty/extensionsTest/)
   [IJ]sbt:extensionsTest> show scalacOptions;scalaVersion;clean;compile;run
   [info] * -source:3.1
   [success] Total time: 0 s, completed Jul 19, 2020, 11:50:50 AM
   [info] 0.26.0-bin-20200718-c753ca3-NIGHTLY
   [success] Total time: 0 s, completed Jul 19, 2020, 11:50:51 AM
   [info] Compiling 2 Scala sources to /opt/local/github.dotty/extensionsTest/target/scala-0.26/classes ...
   [info] Done compiling.
   [success] Total time: 3 s, completed Jul 19, 2020, 11:50:53 AM
   [info] running Main 
   1a) w=Vector(0, 52); z=Vector(40, 0, 52) w.length=2
   1b) w=Vector(0, 52); z=Vector(41, 0, 52) w.length=-2
   
   2a) w=Vector(41, 0); z=Vector(41, 0, 50) w.length=2
   2b) w=Vector(41, 0); z=Vector(41, 0, 52) w.length=-2
   
   [success] Total time: 0 s, completed Jul 19, 2020, 11:50:53 AM
   [IJ]sbt:extensionsTest> 
```