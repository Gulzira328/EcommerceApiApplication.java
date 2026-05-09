The API handles errors using the following HTTP status codes: 403 if there is 
no token, 401 if the token is invalid. Data is validated using @Valid. The 
business logic is implemented in the OrderService and UserService; the 
controllers only handle requests. Access to /orders requires login.
