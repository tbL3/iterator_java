public class TwitterIterator implements PostIterator {

    private TweetCollection tweetCollection;

    private int index = 0;

    public TwitterIterator(TweetCollection tweetCollection){
        this.tweetCollection = tweetCollection;
    }

    /**
    Renvoie un booléen indiquant la présence ou non d'un autre élément
    dans la collection après l'élément actuel

     @return True quand il y a une autre élément après, False quand on est arrivé en fin de collection
     **/
    @Override
    public boolean hasNext() {
        return this.index < tweetCollection.getSize();
    }

    /**
     * Renvoie l'Object (ici un objet de type Tweet) actuel et incrémente le curseur (index)
     * uniquement si la collection contient un élément après l'élément actuel
     *
     * @return Le tweet actuel
     */
    @Override
    public Object getNext() {
        if(this.hasNext()){
            return tweetCollection.getCollection().get(index++);
        }
        return null;
    }

    @Override
    public void reset(){
        this.index = 0;
    }
}
