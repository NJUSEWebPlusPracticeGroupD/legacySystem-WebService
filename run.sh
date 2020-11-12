#!/usr/bin/env bash
#!/bin/bash
APP_DIR="legacySystem-webService"
PROCESS_NAME=oldCompanySystem-0.0.1-SNAPSHOT.jar
kill -9 $(ps -eaf|grep -i "java .*${PROCESS_NAME}"|grep -v 'grep'|awk '{print $2}')
echo "Closing $PROCESS_NAME"
git pull
cd ${APP_DIR}
mvn clean package -Dmaven.test.skip=true
cp target/$PROCESS_NAME $PROCESS_NAME
nohup java -jar $PROCESS_NAME 2> out.log
echo "${PROCESS_NAME} Started"