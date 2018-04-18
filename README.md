# docker-compose-demo
A simple Docker Compose Demo for Spring Cloud Project . 

## how to use

* build maven project and push them into docker by running "build-images.sh"

* running project by using docker-compose :
 
        docker-compose up -d
        
* stop all the project by running :

        docker-compose down          
        
* if you changed the code , plz run :

        docker-compose down 
        
        ./rm-images.sh
        
        ./build-image.sh
        
        docker-compose up
        
                