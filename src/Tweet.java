public class Tweet {

    // Chaque tweet possède un attribut "body" contenant un message
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
