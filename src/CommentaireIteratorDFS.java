import java.util.Iterator;
import java.util.Stack;

public class CommentaireIteratorDFS implements PostIterator<Commentaire> {
    private Stack<Iterator<Commentaire>> stack = new Stack<>();
    private CommentaireCollection commentaireCollection;

    public CommentaireIteratorDFS(CommentaireCollection commentaireCollection) {
        // Initialiser la pile avec l'itérateur de la collection racine
        stack.push(commentaireCollection.getCommentaires().iterator());
        this.commentaireCollection = commentaireCollection;
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }

        Iterator<Commentaire> iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }

        return true;
    }

    public Commentaire getNext() {
        if (hasNext()) {
            Iterator<Commentaire> iterator = stack.peek();
            Commentaire commentaire = iterator.next();

            if (!commentaire.getReponses().isEmpty()) {
                // Si le commentaire a des réponses, les ajouter à la pile
                stack.push(commentaire.getReponses().iterator());
            }

            return commentaire;
        } else {
            return null;
        }
    }

    @Override
    public void reset() {
        stack.clear();  // Effacer la pile
        stack.push(commentaireCollection.getCommentaires().iterator());  // Réinitialiser avec l'itérateur de la collection racine
    }
    
}
