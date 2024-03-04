#! /bin/bash

docker run -p 8089:8080 -p 50002:50000 \
       	-v /var/run/docker.sock:/var/run/docker.sock \
	-v $(pwd)/jenkins_home:/var/jenkins_home \
	jenkins-seila
