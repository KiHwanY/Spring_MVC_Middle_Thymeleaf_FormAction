package hello.itemservice.domain.item;


// enum Class는 열거체(enumeration type) 으로 JDK 1.5 이상의 버전에서만 사용이 가능하다.
public enum ItemType {
    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


// 간단하게 정의하자면 다음과 같다.

// 1. 클래스처럼 보이게 하는 상수
// 2. 서로 관련있는 상수들끼리 모아 상수들을 정의하는 것
// 3. enum 클래스 형을 기반으로 한 클래스형 선언
// 4. 열거체 정의는 enum 클래스용인 java 파일로 선언, 타 클래스 내부에 선언, 클래스 외부에 선언 등으로 이용하고는 하는데, 일반적으로 열거체 정의용 java class 파일을 따로 만들어 사용하고는 한다.


// 특징

// 1. 열거형으로 선언된 순서에 따라 0부터 index 값을 가진다.(순차적으로 증가)
// 2. enum 열거형으로 지정된 상수들은 모두 대문자로 선언한다.
// 3. 열거형 변수들을 선언한 후 마지막에 세미콜론(;)을 찍지 않는다.
// 4. 상수의 특정 값을 연결시킬경우 마지막에 세미콜론(;)을 붙여줘야 한다.

// [기본적인 문법]
/*
* 문법 : enum 열거체 이름 {상수1, 상수2, ...}
* 코드 : enum Company {SK, LG, KT, SAMSUNG, APPLE}
* 사용법 : Company.APPLE
* */