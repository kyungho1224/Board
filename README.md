## GitFlow
* feature
  * 기능 단위 개발 브랜치
  * 개발 완료 후 merge (feature -> release)
* release
  * feature 가 모이는 통합 테스트 브랜치
  * 테스트 완료 후 merge (release -> master)
* hotfix
  * 운영 중 긴급한 오류를 해결하기 위한 브랜치
* master
  * 기본 브랜치
  * 언제든지 배포 가능한 형태를 유지

---

## Naming Convention
* project(프로젝트)
  * 대문자 시작 사용 권장
* package(패키지)
  * 소문자로 시작
  * 모두 소문자 사용 권장
  * 가급적 한 단어 사용 권장
  * 표준패턴 : com.회사혹은개인이름.프로젝트명.상위패키지.하위패키지.클래스
* class(클래스)
  * 대문자로 시작
  * 명사로 시작
  * 카멜 케이스
* interface(인터페이스)
  * 대문자로 시작
  * 형용사를 사용
  * 카멜 케이스
* method(함수)
  * 소문자로 시작
  * 동사로 시작
  * 카멜 케이스
* variable(변수)
  * 소문자로 시작
  * 카멜 케이스
* constant(상수)
  * 대문자로 구성
  * 모두 대문자 사용 권장
  * 스네이크 케이스

---