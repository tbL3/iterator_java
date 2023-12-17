import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Tweet> tweets = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void createTextTweet(String body) {
        tweets.add(new TweetText(this, body));
    }

    public void createImageTweet(int resolutionX, int resolutionY) {
        tweets.add(new TweetImage(this, resolutionX, resolutionY));
    }

    public void createVideoTweet(String videoUrl) {
        tweets.add(new TweetVideo(this, videoUrl));
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    

}
