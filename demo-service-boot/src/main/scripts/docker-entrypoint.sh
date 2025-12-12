#!/bin/sh
set -e

# 默认开启  remote debug
JAVA_DEBUG_OPTS="$JAVA_DEBUG_OPTS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"
JAVA_OPTS="$JAVA_OPTS -Xms512m -Xmx512m"

# 通过环境变量控制是否开启调试
if [ "$ENABLE_DEBUG" = "false" ]; then
  JAVA_DEBUG_OPTS=""
  echo "[INFO] Java remote debug disabled"
fi

exec java ${JAVA_OPTS} ${JAVA_DEBUG_OPTS} -jar app.jar
