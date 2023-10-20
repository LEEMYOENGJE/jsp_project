package commons;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message); // super() 매개변수 있는 것을 사용할 때는 슈퍼를 항상 정의해야함 안 그러면 맨날 기본 생성자만 추가됨
    }
}
