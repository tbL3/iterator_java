public class TestPattern {

    public static void main(String[] args) {
        TweetCollection tweetCollection1 = new TweetCollection();

        tweetCollection1.add(new Tweet("Salut !"));
        tweetCollection1.add(new Tweet("Mdr trop drole !"));
        tweetCollection1.add(new Tweet("Triple monstre !"));

        for(PostIterator iter = tweetCollection1.createIterator(); iter.hasNext();){
            System.out.println(iter.getNext());
        }
    }
}
