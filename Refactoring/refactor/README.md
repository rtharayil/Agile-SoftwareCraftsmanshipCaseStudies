Start the service 

./mvnw spring-boot:run


Add an product item 
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X POST -d '{"name":"Forest Honey","sellIn": 25, "quality": 40 ,"batch_ID": 1435}' http://localhost:8080/item



This is a microservices that computes the quality of various products in our inventory. A product type can be added to the system at any time.
Each product item has 
a Product  Name 
Sellin  - Shelf Life in days
Quality -  a value between 0 to 50 
Batch_ID - a value to identify the lot in our inventory 

Each product item has a quality value that is updated every day automatically at a set time based on a  set of rules. 
