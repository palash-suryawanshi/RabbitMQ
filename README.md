## Project Name: RabbitMQ Integration in Spring Boot

### Overview
This Spring Boot project demonstrates the integration of RabbitMQ, a message broker that facilitates communication between different components of a system. In this project, RabbitMQ is used to implement a messaging system with producers and consumers.

### Technologies Used
- Framework: Spring Boot
- Message Broker: RabbitMQ

### Components

#### Producer
1. **Sending Messages**
    - Producers are responsible for sending messages to the RabbitMQ exchange.

2. **Integration with Spring Boot**
    - Spring Boot application configured to act as a message producer.
    - Utilizes Spring AMQP for RabbitMQ integration.

3. **Message Queue Configuration**
    - Configure RabbitMQ properties (host, port, credentials) in the application properties.

#### Consumer
1. **Receiving and Processing Messages**
    - Consumers listen for messages from the RabbitMQ queue and process them accordingly.

2. **Integration with Spring Boot**
    - Spring Boot application configured to act as a message consumer.
    - Utilizes Spring AMQP for RabbitMQ integration.

3. **Message Handling**
    - Define message handling logic in consumer code.
    - Acknowledge messages after successful processing to ensure they are not requeued.

### How to Run

1. **RabbitMQ Setup**
    - Ensure RabbitMQ is installed and running.
    - Update RabbitMQ connection properties in the application properties.

2. **Clone Repository**
    ```bash
    git clone https://github.com/your-username/rabbitmq-spring-boot.git
    cd rabbitmq-spring-boot
    ```

3. **Build and Run Producer**
    ```bash
    cd producer
    mvn clean install
    java -jar target/producer-application.jar
    ```

4. **Build and Run Consumer**
    ```bash
    cd consumer
    mvn clean install
    java -jar target/consumer-application.jar
    ```

### Usage

1. **Producer**
    - Producer sends messages to the RabbitMQ exchange.
    - Check the console for logs indicating successful message sending.

2. **Consumer**
    - Consumer listens for messages from the RabbitMQ queue.
    - Check the console for logs indicating successful message reception and processing.

### Configuration
- RabbitMQ connection details, such as host, port, username, and password, can be configured in the `application.properties` file.

