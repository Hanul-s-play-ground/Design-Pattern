package adapter;

public class Main {

    public static void main(String[] args) {
        WebAdapter webAdapter = new WebAdapter(new NewWebRequester());
        WebClient client = new WebClient(webAdapter);
        client.doWork();
    }
}
