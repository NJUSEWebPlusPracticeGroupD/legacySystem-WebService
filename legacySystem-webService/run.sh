#!/usr/bin/env bash
#!/bin/bash
PROCESS_NAME=oldCompanySystem
kill -9 $(ps -eaf|grep -i "java .*-classpath .*${PROCESS_NAME}"|grep -v 'grep'|awk '{print $2}')
git pull
nohup mvn org.springframework.boot:spring-boot-maven-plugin:2.2.4.RELEASE:run 2> ${PROCESS_NAME}.log