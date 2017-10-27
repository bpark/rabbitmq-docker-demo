#!/usr/bin/env bash

cd /var/workspace

docker run -d -p 8080:15672 -p 5672:5672 --hostname my-rabbit rabbitmq:management-alpine
