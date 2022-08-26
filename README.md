## FAST CAMPUS "Java&Spring boot로 시작하는 웹 프로그래밍"의 Final Project
### 01. 프로젝트명
+ 스프링 부트를 이용한 게시판 프로그램

### 02. 프로젝트 설명
+ 스프링부트를 이용하여 웹 프로젝트를 생성하고 BOARD 테이블에 대한 CRUD 기능의 게시판 프로그램을 개발.
+ 데이터베이스 연동은 반드시 Spring Data JPA를 이용하여 처리.
+ 로그인, 회원 가입 등 회원과 관련된 어떤 기능도 구현하지 않고, 오로지 게시판 프로그렘의 CRUD 기능만 구현.

### 03. 프로젝트 과제 상세
#### 비즈니스 컴포넌트 설계와 구현/환경 설정
+ 영속성 관리를 위해 Board 엔티티 클래스를 작성하고 JPA가 제공하는 Annotation을 설정하여 BOARD 테이블과 매핑.
+ 식별자 필드 값은 시퀀스를 이용하여 자동으로 증가하도록 설정.
+ Repository 인터페이스는 CrudRepository 인터페이스를 상속하여 작성.
+ 비즈니스 컴포넌트에 대한 Service 인터페이스는 별도로 도출하지 않고, 비즈니스 컴포넌트를 사용하는 클라이언트는 인터페이스 없이 바로 서비스 구현 클래스를 사용하도록 설계.
+ 프로젝트의 모든 환경설정은 application.properties 파일을 통해 처리하고, application.properties 파일에 Server Port, DataSource, JPA 구현체 설정 등 애플리케이션의 모든 환경을 설정.

#### 데이터베이스 연동 설계와 구현
+ 데이터베이스 연동은 반드시 Spring Data JPA를 이용하여 구현.
+ 게시판 테이블과 시퀀스는 Board 엔티티에 설정된 Annotation을 기반으로 자동으로 생성.

#### 컨트롤러 클래스 설계와 구현
+ 컨트롤러 클래스는 게시판 관련 컨트롤러 하나로 모든 요청을 처리하도록 작성.
+ 비즈니스 컴포넌트는 인터페이스를 제공하지 않도록 설계했기 때문에 컨트롤러 클래스가 비즈니스 컴포넌트를 사용할 때 비
즈니스 클래스를 직접 사용하도록 구현.

#### 추가 점검사항
+ TITLE, WRITER, CONTENT 는 빈값이 아니여야 하고 빈값을 입력시 에러가 발생해야 함.
+ 글을 수정 할 때마다 cnt가 1씩 증가해야 함.
+ 조회를 할때마다 cnt를 1씩 증가해야 함.
+ SEQ는 자동으로 1씩 증가해야 함.

***
### 사용한 기술
+ Spring Boot, Java 11, Gradle, JSP, JPA, MySQL