# Simplified Distributed Computing Framework

This project aims to simulate the basic functionalities of a distributed computing framework, akin to Hadoop or Spark, focusing on parallel processing and task distribution across multiple nodes. It's designed as a foundational tool for understanding the principles of distributed systems and big data management.

## Features

- **Job Distribution**: Splits a larger job into smaller tasks and distributes them among worker nodes.
- **Task Execution**: Simulates the execution of tasks on worker nodes.
- **Basic Communication**: Utilizes a simplified communication mechanism to send tasks from the master node to worker nodes.
- **Fault Tolerance**: Implements basic fault tolerance by logging task execution failures.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- An IDE like Visual Studio Code with Java Extension Pack (or any Java-supported IDE)

### Installation

1. Clone the repository to your local machine:

git clone https://github.com/cpowell117/simplified-distributed-computing-framework.git

2. Open the project in your IDE.
3. Compile and run the `Application.java` to start the simulation.

## Usage

Run the `Application.java` file to simulate distributing and executing tasks. The terminal will display logs of job distribution, task reception, and execution to demonstrate how tasks are managed and processed across simulated worker nodes.

## Contributing

We welcome contributions from the community. If you would like to contribute to the project, please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE) file for details.

## Acknowledgments

- Inspired by distributed computing frameworks like Apache Hadoop and Apache Spark.
- This project is intended for educational purposes to understand the basics of distributed systems.

