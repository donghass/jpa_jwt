이 프로젝트는 Spring Boot, Spring Security, JPA를 활용하여 JWT(Json Web Token) 기반의 인증 시스템을 구축한 간단한 예제입니다. 사용자는 회원가입 후 로그인하여 JWT를 발급받고, 해당 토큰을 이용하여 보호된 API에 접근할 수 있습니다.

사용 기술 스택
Spring Boot 3
Spring Security 6
JPA 
MySQL
JWT

사용자가 회원가입 (/auth/signup) API를 통해 계정을 생성한다.
로그인 (/auth/login)을 하면 JWT 토큰을 발급받는다.
이후 보호된 API (/user/info)를 호출할 때 헤더에 JWT를 포함하여 요청한다.
서버에서 JWT를 검증하여 유효한 사용자라면 요청을 처리하고, 그렇지 않다면 401 Unauthorized를 반환한다.
