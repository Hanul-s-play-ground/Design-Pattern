package adapter;

public class WebAdapter implements WebRequester{
    private NewWebRequester newWebRequester;

    public WebAdapter(NewWebRequester newWebRequester) {
        this.newWebRequester = newWebRequester;
    }

    @Override
    public void requestHandler() {
        newWebRequester.requestHandler();
    }
}
