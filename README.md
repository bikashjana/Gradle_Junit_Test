# Gradle_Junit_Test
Simple demo application to understand Junit working using Gradle



Gradle installation steps : https://gradle.org/install/

## Gradle Dependency

Add the following lines to build.gradle in order to include JUnit dependencies

apply plugin: 'java'

dependencies {
   
    testCompile 'junit:junit:4.12'  
}

## Execution and results


##### Either run 'gradle build' or 'gradle run' to see the test results. 

![untitled](https://user-images.githubusercontent.com/33976658/36268398-5f2bc878-129c-11e8-89ff-ba107238119f.png)


##### Or we can see the test report withinin project_path/build/reports/tests/test/index.html

![untitled1](https://user-images.githubusercontent.com/33976658/36268497-a1d9d598-129c-11e8-8322-c013a2529862.png)

