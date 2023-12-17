public class TweetText extends Tweet {
    public TweetText(User user, String body) {
        super(user, body);
    }

    @Override
    public void display() {
        System.out.println("je suis un tweet textuel, " + getBody());
    }
}