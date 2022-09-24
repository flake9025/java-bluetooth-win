# Java Windows Bluetooth LE Driver

Note : This is a work in progress

## What is it for ?

This project is a Java Client / Driver for using Windows 10 Bluetooth LE API.

It provides the following operations :
- Get Devices
- Get Device Services
- Get Service Characteristics
- Get / Set a Characteristic value

## How to use ?

This project is based on the JNI technology : it contains only an interface, describing functional operations.
The result of the build is a generated C++ header.

To compile, you need to set the environment variable "JDK_HOME" to a valid JDK installation path.
Then, you will be able to run the Maven command :
```shell
mvn clean install
```

Maven will produce the header in target/generated-sources/java-bluetooth-win.h 

Then, the interface is loaded and the implementation made with C++ in another project :
[C++ Windows Bluetooth BLE](https://github.com/flake9025/cpp-bluetooth-win)

A 3rd project will come, resulting in
- the C++ libraries
- the Java interface and unit tests


