# rabbitmq-docker-demo
demo project to show rabbitmq and docker in action.

## Installation

1. Download vagrant Version **1.9.5** from

   https://www.vagrantup.com/downloads.html
   
2. Download VirtualBox Version **5.1.22** from

   https://www.virtualbox.org/wiki/Downloads
   	
3. Go to the project directory and type
   	
   ```
   vagrant up	
   ```
4. Login to the virtual machine
   ```
   vagrant ssh	
   ```
   
The virtual machine runs on `192.168.77.8`.

7. Start a consumer by running _Receiver_

8. Start a producer by running _Sender_ 

Note: This demo uses the official rabbitmq:management-alpine image, the management console is bound to 8080 (http://192.168.77.8:8080)  
    
    
   