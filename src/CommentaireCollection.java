import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CommentaireCollection implements PostCollection<Commentaire> {
    private List<Commentaire> commentaires = new ArrayList<>();

    public CommentaireCollection(){}

    @Override
    public boolean add(Commentaire commentaire){
        try{
            commentaires.add(commentaire);
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public int getSize(){
        return commentaires.size();
    }
    
    @Override
    public PostIterator<Commentaire> createIterator(){
        return new CommentaireIteratorDFS(this);
    }

    public PostIterator<Commentaire> createIteratorBFS(){
        return new CommentaireIteratorBFS(this);
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

}
