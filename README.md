#Robotic Hoover Implementation

The service accept as input a JSON payload of the format,
{
  "roomSize" : [5, 5],
  "coords" : [1, 2],
  "patches" : [
    [1, 0],
    [2, 2],
    [2, 3]
  ],
  "instructions" : "NNESEESWNWW"
}

It is a Spring Boot Application that exposes a Rest API service

#Software Prerequisite

Java 8
Intellij Idea IDE

#Open Project

File -> Open -> robotic-hoover in IDE to open project

# To start the application

Run -> RoboticHooverApplication.java from IDE


# Service URL (Via Rest Client)
http://localhost:8080/robotichoover

Post Data:
{
  "roomSize" : [5, 5],
  "coords" : [1, 2],
  "patches" : [
    [1, 0],
    [2, 2],
    [2, 3]
  ],
  "instructions" : "NNESEESWNWW"
}

#To run tests:

Select Run All Tests on Test Folder
