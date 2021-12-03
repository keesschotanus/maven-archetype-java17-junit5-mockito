# Maven Archetype for Java17 with JUnit5 and Mockito quickstart
This maven archetype allows you to quickly get started with [JUnit5](https://junit.org/junit5/)
and [Mockito](https://site.mockito.org/),
using [Java](https://dev.java/) version 17.

You will end up with a simple Application.java file containing a main method,
and an ApplicationTest.java file with some simple tests that use both JUnit and Mockito.
It even contains a a simple [Hamcrest](http://hamcrest.org/) matcher.

## Setup
Clone this repository and then execute
```bash
mvn install
```

## Usage
You can create your project interactively by executing:
```bash
mvn archetype:generate -DarchetypeGroupId=com.schotanus.maven.archetype -DarchetypeArtifactId=java17-junit5-mockito
```
and then entering values for the different properties, or inactively by executing:
```bash
mvn archetype:generate \
  -DarchetypeGroupId=com.schotanus.maven.archetype \
  -DarchetypeArtifactId=archetypeArtifactId=java17-junit5-mockito \
  -DarchetypeVersion=1.0.0 \
  -DgroupId=your-group-id \
  -DartifactId=your-artifact-id \
  -Dversion=1.0.0-SNAPSHOT \
  -DinteractiveMode=false
```
where you supply all properties on the command line.
For example:
```bash
mvn archetype:generate \
  -DarchetypeGroupId=com.schotanus.maven.archetype \
  -DarchetypeArtifactId=archetypeArtifactId=java17-junit5-mockito \
  -DarchetypeVersion=1.0.0 \
  -DgroupId=com.schotanus \
  -DartifactId=hello-world \
  -Dversion=1.0.0-SNAPSHOT \
  -DinteractiveMode=false
```

## About this Maven Archetype

This is my first attempt at creating a Maven Archetype.
The archetype is very simple and might need more flexibility.
It hardly uses properties and the Velocity template language
for example. 

