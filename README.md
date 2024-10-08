# design-pattern-study
디자인패턴을 공부하며 구현한 코드를 정리하는 레포 (Java, Python)

## strategy pattern (전략패턴)
- 알고리즘군을 정의하고 캡슐화해서 독립적으로 알고리즘군을 수정가능케 함

![img](./images/01_strategy_pattern.png)

## observer pattern (옵저버 패턴)
- 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의한다.
  - subject 는 observer 가 observer interface 를 구현한다는 사실만 알고 그 외에는 모름
  - observer 는 언제든지 추가, 삭제 가능
  - 새로운 형태의 observer 가 추가되어도 subject 를 변경할 필요가 없음
  - 즉, subject 와 observer 는 느슨한 결합 (loosely coupled) 상태

![img](./images/02_observer_pattern.png)

## decorator pattern (데코레이터 패턴)
- 객체에 추가 요소를 동적으로 더할 수 있다.
- 한 객체를 여러 개의 데코레이터로 감쌀 수 있다.

![img](./images/03_decorator_pattern.png)

## factory pattern (팩토리 패턴)
### factory method pattern (팩토리 메소드 패턴)
- 클래스 인스턴스 만드는 일을 서브클래스에게 맡긴다. 사용하는 서브클래스에 따라 생산되는 객체 인스턴스가 결정된다.
- 팩토리 메소드는 추상 메소드로 구현되어 있고 서브클래스에서 이를 구현한다.

![img](./images/04_factory_pattern_1.png)

### abstract factory pattern (추상 팩토리 패턴)
- 구상 클래스에 의존하지 않고 서로 연관되거나 의존적인 객체로 이루어진 제품군을 생성하는 인터페이스를 제공한다.
- 구상 클래스는 서브클래스에서 만든다.
- 팩토리 매소드와 거의 유사하나 `NYPizzaStore` 에서 바로 각 피자 객체를 만드는 것이 아니라 `IngrediendFatory` 를 이용한다.

## singleton pattern (싱글턴 패턴)
- 클래스 인스턴스를 하나만 만든다.
- 하지만 멀티스테딩 관련해서 주의해야 할 점이 있다.

## command pattern (커맨드 패턴)
- 요청을 객체로 캡슐화한다.
- 요청하는 객체와 요청을 수행하는 객체를 분리한다.

![img](./images/06_command_pattern.png)

## adaptor pattern (어댑터 패턴)
- 특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환한다.
- 인터페이스가 호환되지 않아 같이 쓸 수 없었던 클래스를 사용할 수 있게 된다.

## facade pattern (퍼사드 패턴)
- 여러 개의 인터페이스들을 묶어서 실행하기 편하게 만든다.

## template method pattern (템플릿 메소드 패턴)
- 여러 클래스에서 공통으로 사용하는 메서드를 템플릿화하여 상위 클래스에서 abstract method 로 정의하고 하위 클래스에서 세부 동작 사항을 구현하는 것이다.

![img](./images/09_template_method_pattern.png)

## Iterator pattern (반복자 패턴)
- 컬랙션(그냥 객체들의 모음)의 구현 방법을 노출하지 않으면서 집합체 내의 모든 항목에 접근하는 방법을 제공한다.
- java code 를 보면 각 메뉴들의 컬랙션이 구현되어 있는 방법이 다르지만 동일하게 iterator 를 사용하도록 해서 waitress 가 iterator 를 통해서 접근하도록 한다.

## Composite pattern (컴포지트 패턴)
- 객체를 트리구조로 구성해서 계층구조를 구현한다.
- 트리구조 구현시 node, leaf 모두 동일한 인터페이스를 구현해서 클라이언트 입장에서 똑같이 다룰 수 있고 확장성에도 유리하다.

