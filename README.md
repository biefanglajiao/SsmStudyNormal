# ssm框架的整合：

> 进行SSM框架整合时，3个框架的分工如下所示。
> MyBatis负责与数据库进行交互。
> Spring负责事务管理, $pring可以管理持久层的Mapper对象及业务层的Service对象。由于Mapper对象和Service对象都在Spring容器中，所以可以在业务逻辑层通过Service对象调用持久层的Mapper对象。
> Spring MVC负责管理表现层的Handler。Spring MVC容器是Spring容器的子容器,因此Spring MVC容器可以调用Spring容器中的Service对象。

- ### 创建对应的数据库

- ### 创建项目  （创maven扩展web）

>- 导包  pom.xml
>
>```xml
><?xml version="1.0" encoding="UTF-8"?>
><project xmlns="http://maven.apache.org/POM/4.0.0"
>         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
>         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
>    <modelVersion>4.0.0</modelVersion>
>
>    <groupId>org.example</groupId>
>    <artifactId>SsmStudyNormal</artifactId>
>    <version>1.0-SNAPSHOT</version>
>
>    <properties>
>        <maven.compiler.source>8</maven.compiler.source>
>        <maven.compiler.target>8</maven.compiler.target>
>        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
>    </properties>
>    <packaging>war</packaging>
>
><dependencies>
>    <!-- Spring相关依赖  -->
>    <dependency>
>        <groupId>org.springframework</groupId>
>        <artifactId>spring-context</artifactId>
>        <version>5.2.8.RELEASE</version>
>    </dependency>
>    <!--Spring事务管理-->
>    <dependency>
>        <groupId>org.springframework</groupId>
>        <artifactId>spring-tx</artifactId>
>        <version>5.2.8.RELEASE</version>
>    </dependency>
>    <dependency>
>        <groupId>org.springframework</groupId>
>        <artifactId>spring-jdbc</artifactId>
>        <version>5.2.8.RELEASE</version>
>    </dependency>
>    <dependency>
>        <groupId>org.springframework</groupId>
>        <artifactId>spring-test</artifactId>
>        <version>5.2.8.RELEASE</version>
>    </dependency>
>    <!--Spring MVC的相关依赖  -->
>    <dependency>
>        <groupId>org.springframework</groupId>
>        <artifactId>spring-webmvc</artifactId>
>        <version>5.2.8.RELEASE</version>
>    </dependency>
>    <!--MyBatis相关依赖-->
>    <dependency>
>        <groupId>org.mybatis</groupId>
>        <artifactId>mybatis</artifactId>
>        <version>3.5.2</version>
>    </dependency>
>    <!--MyBatis与Spring整合相关依赖-->
>    <dependency>
>        <groupId>org.mybatis</groupId>
>        <artifactId>mybatis-spring</artifactId>
>        <version>2.0.1</version>
>    </dependency>
>    <!--数据源-->
>    <dependency>
>        <groupId>com.alibaba</groupId>
>        <artifactId>druid</artifactId>
>        <version>1.1.20</version>
>    </dependency>
>    <!--单元测试相关的依赖-->
>    <dependency>
>        <groupId>junit</groupId>
>        <artifactId>junit</artifactId>
>        <version>4.12</version>
>        <scope>test</scope>
>    </dependency>
>    <!-- 相关的依赖-->
>    <!--ServletAPI：引入servlet的功能   -->
>    <dependency>
>        <groupId>javax.servlet</groupId>
>        <artifactId>javax.servlet-api</artifactId>
>        <version>3.1.0</version>
>        <scope>provided</scope>
>    </dependency>
>    <!--ServletAPI: jsp页面的功能包   -->
>    <dependency>
>        <groupId>javax.servlet.jsp</groupId>
>        <artifactId>jsp-api</artifactId>
>        <version>2.2</version>
>        <scope>provided</scope>
>    </dependency>
>    <!-- 数据库驱动相关依赖-->
>    <dependency>
>        <groupId>mysql</groupId>
>        <artifactId>mysql-connector-java</artifactId>
>        <version>8.0.16</version>
>    </dependency>
>
>    <!--json格式返回值需要的包   俩-->
>    <dependency>
>        <groupId>com.fasterxml.jackson.core</groupId>
>        <artifactId>jackson-databind</artifactId>
>        <version>2.12.2</version>
>    </dependency>
>    <dependency>
>        <groupId>com.fasterxml.jackson.core</groupId>
>        <artifactId>jackson-annotations</artifactId>
>        <version>2.12.2</version>
>    </dependency>
></dependencies>
></project>
>```
>
>





