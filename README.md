# spring-elastic-search-dummies


## Build - gradle
dependencies used - spring-jpa, spring-web, spring-security, io.jsonwebtoken, mysql-connector

# How to run this application

## Machine Prerequisite
- Java 8 or later
- Elastic Search dependecy
- Gradle

## Local environment

In order to run the Integration tests a Postgres database is required.

### Running service for the first time
In order to force the download of dependencies outside of IntelliJ:

`./gradlew build --refresh-dependencies`

### Run any service

`./gradlew bootRun`

### Test and build

#### Run tests (also runs big tests)
`./gradlew clean test`

#### Run big tests only
`./gradlew clean bigTest`

#### Build conditionally on tests
`./gradlew clean build`  

- 📫 Feel free to reach me: @ https://about.me/saurabhshcs

Reach out to me via [about.me](https://about.me/saurabhshcs)

![My github stats](https://github-readme-stats.vercel.app/api?username=saurabhshcs&show_icons=true)


![Profile views](https://komarev.com/ghpvc/?username=saurabhshcs)
