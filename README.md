In this example we are accepting a request variable for get  method and returning a Custom Response from Lambda Function using API Gateway.
First configure the request variable in Method Request in URL Query String Parameters and mark it as Required for additional check.
Use this variable in Integration Request under Mapping Template like with application/json like below 
"{
"firstName":"$input.params('firstName')"
}"
This will bind the request variable.
