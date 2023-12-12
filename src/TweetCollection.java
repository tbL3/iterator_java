import java.util.ArrayList;
import java.util.List;

public class TweetCollection implements PostCollection {

    private List<Tweet> tweets = new ArrayList<>();

    public int getSize(){
        return tweets.size();
    }

    /*
     Cette méthode permet d'ajouter un nouveau tweet à la collection de tweets,
     pour plus de fonctionnalités elle renvoie true si l'ajout a été effectué avec succès,
     sinon elle renvoie false
     */
    @Override
    public boolean add(Object newPost) {
        try{
            tweets.add((Tweet)newPost);
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public List<Tweet> getCollection(){
        return this.tweets;
    }

    public PostIterator createIterator(){
        return new TwitterIterator(this);
    }
}
