# Fibonacci REST Service

## General information
This REST web service takes in a numerical value between 1 to 100 (given by a JSON request) and returns
* a list of the Fibonacci sequence
* a list of the numbers in the Fibonacci sequence, but sorted according to the following:
  * Even numbers first, in descending order
  * Odd numbers, in descending order

Example: If I do a HTTP GET to http://myserver:8000/fibonacci with the following json:
```
{ 
 "elements": 10 
} 
```
it will return me the following JSON: 
```
{ 
 "fibonacci": [0,1,1,2,3,5,8,13,21,34], 
 "sorted": [34,8,2,0,21,13,5,3,1,1] 
} 
```

* http://myserver:8000/greeting also returns a "Hello, User!" greeting. This allows us to test if the application is running.

## Docker
* To create the Docker image, run (in terminal) 
```
docker build -f Dockerfile -t docker-fibonacci-springboot .
```
* To run the Docker container from the image, run (in terminal)
```
docker run -p 8000:8000 docker-fibonacci-springboot
```
