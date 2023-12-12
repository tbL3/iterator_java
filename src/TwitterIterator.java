public class TwitterIterator implements PostIterator {

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
