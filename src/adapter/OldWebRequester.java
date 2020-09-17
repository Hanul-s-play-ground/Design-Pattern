package adapter;

public class OldWebRequester implements WebRequester{
    @Override
    public void requestHandler() {
        System.out.println("It's Old");
    }
}
