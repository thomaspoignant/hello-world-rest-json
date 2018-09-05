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
git run -d -p 8080:8080 thomaspoignant/hello-world-rest-json
```
