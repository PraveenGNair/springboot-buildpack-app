# Spring boot Buildpack Docker Example

## Overview
>A sample spring boot rest service with docker packaging using [springboot](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/#goals-build-image)  maven plugin.

>Spring boot with its 2.3.0.M1 release onwards have introduced capability to build docker images using buildpacks.
>The detailed blog and instructions of using the project is described in [blog](https://medium.com/@prgnr173/containerize-your-spring-boot-app-with-jib-plugin-50127d99a22f?sk=f48f1c31816cacdcd3c47c2e1d0e9bbc).

## Run Command
* Clean compile

`$ mvn clean compile `

* Build image

`$ mvn spring-boot:build-image`

## Result
See the logs and you can find the containerizing steps and image gets pushed to the defined registry.