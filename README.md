# BookMyShow_Backend

## Add these details to `application.properties`

### DB Configuration

```properties
spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver
server.port = 8080
spring.datasource.username = root
spring.datasource.password = your_password
spring.datasource.url = jdbc:mysql://localhost:3306/bookmyshow
### JPA Configuration
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
