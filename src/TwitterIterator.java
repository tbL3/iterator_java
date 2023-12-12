import java.util.ArrayList;
import java.util.List;

public class TwitterIterator implements PostIterator {

    private Tweet tweet;

    private int position = 0;

    private List<Tweet> tweets = new ArrayList<>();

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Post getNext() {
        return null;
    }
}
