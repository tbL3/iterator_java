public abstract class Tweet {

    // Chaque tweet possède un attribut "body" contenant un message
    private String body;
    private User user;

    public Tweet(User user, String body){
        this.user = user;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    @Override 
    public String toString() {
        return body;
    }

    public abstract void display();
}
