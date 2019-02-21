# Java Restful Service

Example 


## Instructions

`./mvnw clean package`

`docker build -t java_restful_example .`

`docker run -it -p 8554:8554 java_restful_example`

Webservice should be running. Use a browser.

http://localhost:8554/dashboard?fib=13

example output: 
`{"result":[],"content":"The Fibonacci series for 13 is!","fib":[0,1,1,2,3,5,8,13,21,34,55,89,144,233]}`


### Run locally

`./mvnw spring-boot:run`