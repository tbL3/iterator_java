public class Tweet extends Post {

    private String title;
    private String body;

    public Tweet(String title, String body){
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return String.format("Title : %s\n%s", this.title, this.body);
    }
}
