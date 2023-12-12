import java.util.ArrayList;
import java.util.List;

public class TwitterIterator implements PostIterator {

    private Tweet tweet;

    private TweetCollection tweetCollection;

    private int position = 0;

    public TwitterIterator(TweetCollection tweetCollection){
        this.tweetCollection = tweetCollection;
    }

    @Override
    public boolean hasNext() {
        return this.position < tweetCollection.getSize();
    }

    @Override
    public Object getNext() {
        if(this.hasNext()){
            return tweetCollection.getCollection().get(position++);
        }
        return null;
    }
}
