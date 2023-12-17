public class TweetVideo extends Tweet {
    private String videoUrl;

    public TweetVideo(User user, String videoUrl) {
        super(user, "je suis une video");
        this.videoUrl = videoUrl;
    }

    @Override
    public void display() {
        System.out.println("je suis une video disponible ici : " + videoUrl);
    }
}