import java.util.ArrayList;
import java.util.List;

public class TweetCollection implements PostCollection {

    private List<Tweet> tweets = new ArrayList<>();

    public int getSize(){
        return tweets.size();
    }

    @Override
    public void add(Object newPost) {
        try{
            tweets.add((Tweet)newPost);
        } catch (ClassCastException e) {
            System.out.println("Wrong object type");
        }
    }

    public List<Tweet> getCollection(){
        return this.tweets;
    }

    public PostIterator createIterator(){
        return new TwitterIterator(this);
    }
}
