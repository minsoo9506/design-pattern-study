# design-pattern-study
디자인패턴을 공부하며 구현한 코드를 정리하는 레포 (Java, Python)

## strategy pattern (전략패턴)
- 알고리즘군을 정의하고 캡슐화해서 독립적으로 알고리즘군을 수정가능케 함

![img](./01_strategy_pattern.png)

## observer pattern (옵저버 패턴)
- 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의한다.
  - subject 는 observer 가 observer interface 를 구현한다는 사실만 알고 그 외에는 모름
  - observer 는 언제든지 추가, 삭제 가능
  - 새로운 형태의 observer 가 추가되어도 subject 를 변경할 필요가 없음
  - 즉, subject 와 observer 는 느슨한 결합 (loosely coupled) 상태

![img](./02_observer_pattern.png)