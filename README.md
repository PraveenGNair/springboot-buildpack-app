# Spring boot Buildpack Docker Example

## Overview
>A sample spring boot rest service with docker packaging using [springboot](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/#goals-build-image)  maven plugin.

>Spring boot with its 2.3.0.M1 release onwards have introduced capability to build docker images using buildpacks.
>The detailed blog and instructions of using the project is described in [blog](https://medium.com/@prgnr173/creating-docker-images-in-spring-boot-using-build-packs-4ecc853f5732).

## Run Command
* Clean compile

`$ mvn clean compile `

* Build image

`$ mvn spring-boot:build-image`

## Result
See the logs and you can find the containerizing steps and image gets pushed to the defined registry.