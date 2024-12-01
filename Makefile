build:
	./gradlew clean build

lint:
	@./gradlew checkstyleTest
	@./gradlew checkstyleMain

test:
	./gradlew test

install:
	@./gradlew installDist

report:
	./gradlew jacocoTestReport

run:
	@./gradlew run --args='--spring.profiles.active=prod'

dev:
	@./gradlew run --args='--spring.profiles.active=dev'

dev-db:
	@./gradlew run --args='--spring.profiles.active=db'


.PHONY: build
