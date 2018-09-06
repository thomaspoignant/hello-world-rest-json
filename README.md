# hello-world-rest-json
This project is a small REST hello-world API to build a docker image we can test behind an API Gateway.

The only things it does is to respond
```json
{ "message":"Hello World" }
```
When you call ```http://localhost:8080```.

## docker image
The docker image it-self is available on the docker-hub : https://hub.docker.com/r/thomaspoignant/hello-world-rest-json/

You can run it using :
```shell
> docker run -d -p 8080:8080 thomaspoignant/hello-world-rest-json
```
## API response
The only things it does is to respond
```json
{ "message":"Hello World" }
```
When you call ```http://localhost:8080```.

### CORS
We also add CORS wildcard to be sure you can put it behind your gateway.
```shell
> curl -H "Origin: http://example.org" --verbose http://localhost:8080/
```
output: 
```shell
*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 8080 (#0)
> GET / HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.54.0
> Accept: */*
> Origin: http://example.org
>
< HTTP/1.1 200
< Vary: Origin
< Vary: Access-Control-Request-Method
< Vary: Access-Control-Request-Headers
< Access-Control-Allow-Origin: *
< Content-Type: application/json;charset=UTF-8
< Transfer-Encoding: chunked
< Date: Thu, 06 Sep 2018 21:33:43 GMT
<
* Connection #0 to host localhost left intact
{"message":"HelloWorld"}%
```
