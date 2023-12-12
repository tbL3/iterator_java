public interface PostIterator {

    /**
     * Doit renvoyer si oui ou non l'iterator peut passer
     * à un élément suivant l'élément actuel
     * @return
     */
    boolean hasNext();

    /**
     * Doit renvoyer l'objet actuel de la collection ou liste
     * et incrémenter l'iterator
     * @return Object
     */
    Object getNext();

    /**
     * Doit reinitialiser l'iterator
     * pour permettre un réutilisation
     */
    void reset();
}
