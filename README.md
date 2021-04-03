# 배경(Why)
구글어시스턴스로 집 안의 여러 기기들을 control하는 것을 생각해보자.
![](https://images.velog.io/images/cchloe2311/post/310c53ed-b639-48d1-81c4-f3a399e86d31/image.png)

Google이 Heater, Lamp 객체를 참조해 직접 메서드를 실행하는 방식이다.

이렇게 구현하게 되면 의존성이 발생해 확장에 어려움이 생긴다! (구글어시스턴스가 지원하는 제품이 많아진다면 참조하는 객체도, 분기문도 늘어나 **OCP를 위배**하게 된다!)
# How
**관심사를 분리하자!**

요청을 직접적으로 전달하지 말자. 그리고 모든 요청의 디테일(호출되는 object, method 이름 등)을 뽑아내 **Command class를 구성**하자. 또, **동일한 상위 Interface**를 구현해 확장성을 좋게 하자. 이렇게 하면 다양한 Command를 Concrete Command class와 결합도 없이 사용가능해진다!
![](https://images.velog.io/images/cchloe2311/post/c1ccd400-4a4b-42f0-af1b-44ea952d7dc3/image.png)
# What
위와 같이 동작하는 Command Pattern 이란,
> 실행될 **기능을 캡슐화**해 주어진 여러 기능을 실행할 수 있는 **재사용성이 높은** 클래스를 설계하는 패턴이다.

![](https://images.velog.io/images/cchloe2311/post/b111e368-e148-411a-92ed-504c5a6da9ce/image.png)

- Invoker: Sender, Trigger 역할을하며, 요청을 저장할 수 있다. (단, Receiver로 바로 요청을 보내지 않고 Command를 거친다)
- Command: Command를 실행시키기 위한 method를 정의
- Concrete Commands: 다양한 타입의 요청을 정의, 자기자신에 작업을 하지 않고 **Receiver에 작업을 pass**
- Receiver: 실제 작업을 진행하는 **비즈니스 로직**을 포함
- Client: ConcreteCommand를 정의(생성자 호출 및 Receiver 전달)
## 언제 쓸까?(When)
- object와 연산을 매개변수화 해야할 때
: 해당 패턴 사용 시, **특정 메소드 콜을 stand-alone 객체로** 만들기 때문에, Command를 메소드 매개변수로 보내고 저장하는 게 가능하다!
- 연산을 queue할 때
: command를 **직렬화** 해 String으로 변환할 수 있다. 따라서, 요청을 queue에 넣거나 로그로 남기거나 network로 보낼 수 있다.
- redo / undo
: 이 기능을 구현하기 위해 연산의 history가 있어야 한다. Command를 stack에 넣어 구현 가능하다! 하지만, 메모리를 많이 먹어서 reverse한 Command를 구현하는 방법도 있다!
## Pros
- Invoker, Command를 분리해 SRP를 만족한다
- 쉽게 새로운 Command를 추가할 수 있다. 즉, OCP를 만족한다
- redo / undo 를 구현할 수 있다
- 저장했다가 지연작업이 가능하다
- 여러 simple commands를 합쳐 complex하게 할 수 있다
## Con
- Invoker, Command, Receiver와 같이 여러 레이어를 둬 복잡해 보일 수 있다
## 예제
[CommandPattern - github.com/cchloe2311](https://github.com/cchloe2311/CommandPattern)
# ref.
https://refactoring.guru/design-patterns/command
