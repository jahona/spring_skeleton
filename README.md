# spring_skeleton
spring skeleton 및 자료 정리

# Environment

IntelliJ 사용

# Server

resources/dev/config.properties 에 정보 입력 후 mysql, h2 jdbc를 사용가능

# Client

maven 파일 생성 후 IntelliJ에서 프로젝트로 열기

```
mvn archetype:generate -DgroupId=koreatech.link -DartifactId=restful_client -Dpackage=koreatech.cse.rest.client -Dversion=1.0
```

```
<!-- Spring -->
      <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-core</artifactId>
          <version>4.2.0.RELEASE</version>
      </dependency>
      <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-web</artifactId>
          <version>4.2.0.RELEASE</version>
      </dependency>
      <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-webmvc</artifactId>
          <version>4.2.0.RELEASE</version>
      </dependency>

      <!-- XML and JSON -->
      <dependency>
        <groupId>com.fasterxml.jackson.dataformat</groupId>
        <artifactId>jackson-dataformat-xml</artifactId>
        <version>2.8.4</version>
      </dependency>
      <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-core</artifactId>
        <version>2.8.4</version>
      </dependency>
      <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.8.4</version>
    </dependency>
```

!!필요한 의존성 모듈 입력 후 maven 빌드가 안 될 경우, IntelliJ에서 Import Project from Maven -> import maven project automatically 체크하여 해결한다.
