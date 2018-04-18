#!/bin/bash

echo '============================================================='
echo '$                                                           $'
echo '$                      liumapp                              $'
echo '$                                                           $'
echo '$                                                           $'
echo '$  email:    liumapp.com@gmail.com                          $'
echo '$  homePage: http://www.liumapp.com                         $'
echo '$  Github:   https://github.com/liumapp                     $'
echo '$                                                           $'
echo '============================================================='
echo '.'

# if you have engine project . plz add
# cd ${your engine path}
# mvn clean install

cd docker-compose-eureka

mvn clean package docker:build

cd ..

cd docker-compose-config

mvn clean package docker:build

cd ..

cd docker-compose-gateway

mvn clean package docker:build

cd ..

cd docker-compose-service/demo-api-a

mvn clean package docker:build

cd ..

cd ..

cd docker-compose-service/demo-api-b

mvn clean package docker:build

cd ..

cd ..


