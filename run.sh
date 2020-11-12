#!/usr/bin/env bash
#!/bin/bash
APP_DIR="legacySystem-webService"
PROCESS_NAME=oldCompanySystem
kill -9 $(ps -eaf|grep -i "java .*-classpath .*${PROCESS_NAME}"|grep -v 'grep'|awk '{print $2}')
echo `Closing ${PROCESS_NAME}`
git pull
cd ${APP_DIR}
nohup mvn org.springframework.boot:spring-boot-maven-plugin:2.2.4.RELEASE:run 2> ${PROCESS_NAME}.log
echo `${PROCESS_NAME} Started`