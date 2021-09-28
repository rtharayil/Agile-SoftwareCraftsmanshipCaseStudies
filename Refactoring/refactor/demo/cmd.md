./mvnw spring-boot:run

curl  -H "Accept: application/json" -H "Content-Type: application/json" -X POST -d '{"name":"Forest Honey","sellIn": 25, "quality": 40 ,"batch_ID": 1435}' http://localhost:8080/item