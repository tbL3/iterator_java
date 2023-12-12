public class TestPattern {

    public static void main(String[] args) {
        TweetCollection tweetCollection1 = new TweetCollection();

        tweetCollection1.add(new Tweet("LOL"));
        tweetCollection1.add(new Tweet("MDR"));
        tweetCollection1.add(new Tweet("TEST"));
        tweetCollection1.add(new Tweet("JEAN NAIMAR"));
        tweetCollection1.add(new Tweet("18H30 !"));

        for(PostIterator iter = tweetCollection1.createIterator(); iter.hasNext();){
            System.out.println(iter.getNext());
        }
    }
}
