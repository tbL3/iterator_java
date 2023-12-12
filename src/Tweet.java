public class Tweet {

    private String body;

    public Tweet(String body){
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return this.getBody();
    }
}
