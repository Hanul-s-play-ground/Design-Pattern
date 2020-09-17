package adapter;

/**
 * Adaptee
 * 사용할 써드파티 라이브러리나 외부시스템을 의미한다
 */

public class NewWebRequester implements WebRequester{
    @Override
    public void requestHandler() {
        System.out.println("It's NEW!!!");
    }
}
