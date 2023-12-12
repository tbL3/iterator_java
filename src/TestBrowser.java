public class TestBrowser {

    public static void main(String[] args) {
        PostCollection tweetCollection1 = new TweetCollection();

        tweetCollection1.add(new Tweet("LOL"));
        tweetCollection1.add(new Tweet("MDR"));
        tweetCollection1.add(new Tweet("TEST"));
        tweetCollection1.add(new Tweet("JEAN NAIMAR"));
        tweetCollection1.add(new Tweet("18H30 !"));
        tweetCollection1.add(new Tweet("Taritolemalibarte ?"));
        tweetCollection1.add(new Tweet("Tarte ?"));
        tweetCollection1.add(new Tweet("J'aime mieux ça."));

        for(PostIterator iter = tweetCollection1.createIterator(); iter.hasNext();){
            System.out.println(iter.getNext());
        }

        System.out.println("-----");

        PostIterator iter2 = tweetCollection1.createIterator();

        while(iter2.hasNext()){
            System.out.println(iter2.getNext());
        }

        System.out.println("-----");

        iter2.reset(); // L'iterator est bien réinitialisé

        while(iter2.hasNext()){
            System.out.println(iter2.getNext());
        }
    }
}
