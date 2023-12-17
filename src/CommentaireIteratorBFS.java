import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CommentaireIteratorBFS implements PostIterator<Commentaire> {
    private Queue<Iterator<Commentaire>> queue = new LinkedList<>();
    private CommentaireCollection commentaireCollection;

    public CommentaireIteratorBFS(CommentaireCollection commentaireCollection) {
        // Initialiser la file avec l'itérateur de la collection racine
        queue.add(commentaireCollection.getCommentaires().iterator());
        this.commentaireCollection = commentaireCollection;
    }

    @Override
    public boolean hasNext() {
        while (!queue.isEmpty()) {
            Iterator<Commentaire> current = queue.peek();
            if (current.hasNext()) {
                return true;
            } else {
                queue.remove();
            }
        }
        return false;
    }

    @Override
    public Commentaire getNext() {
        if (hasNext()) {
            Iterator<Commentaire> current = queue.peek();
            Commentaire commentaire = current.next();

            if (!commentaire.getReponses().isEmpty()) {
                // Ajouter les réponses du commentaire actuel à la file
                queue.add(commentaire.getReponses().iterator());
            }

            return commentaire;
        } else {
            return null;
        }
    }

    @Override
    public void reset() {
        queue.clear();  // Effacer la file
        queue.add(commentaireCollection.getCommentaires().iterator());  // Réinitialiser avec l'itérateur de la collection racine
    }
}
