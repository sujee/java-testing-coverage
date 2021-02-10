# java-testing-coverage

This project demonstrates

- how to use Junit 5 (an update on 4) for Unit tests
- And how to generate test coverage using Junit + JaCoCo

## Running it in Eclipse

- Import the project into Eclipse as a 'Existing maven project'
- Right click on a Junit test and 'Run as --> Junit'
- To see test coverage : Right click on Junit test 'Coverage As --> JUnit'

## Running using MVN

`mvn test`  will run tests and create coverage report under `target/site/jcoco/index.html`