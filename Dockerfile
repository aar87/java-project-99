FROM gradle:8.11.0-jdk23

WORKDIR /

COPY / .

RUN ./gradlew installDist

CMD ./build/install/app/bin/app
