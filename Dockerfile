FROM openjdk:8
MAINTAINER Shubham Ahlawat shubham.ahlawat@iiitb.org
COPY ./target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator-1.0-SNAPSHOT.jar","Calculator.Calculator"]
