public class TestBrowser {


    public static void main(String[] args) {
        // Création des utilisateurs
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        // Création des tweets
        user1.createTextTweet("Bonjour, ceci est un tweet textuel !");
        user2.createImageTweet(1920, 1080);
        user3.createVideoTweet("http://exemple.com/video");

        TweetCollection tweetCollection = new TweetCollection();
        for (Tweet tweet : user1.getTweets()) {
            tweetCollection.add(tweet);
        }
        for (Tweet tweet : user2.getTweets()) {
            tweetCollection.add(tweet);
        }
        for (Tweet tweet : user3.getTweets()) {
            tweetCollection.add(tweet);
        }

        // Parcourir et afficher les tweets
        PostIterator<Tweet> tweetIterator = tweetCollection.createIterator();
        while (tweetIterator.hasNext()) {
            Tweet tweet = (Tweet) tweetIterator.getNext();
            tweet.display();
        }

        // Création de commentaires et de réponses
        CommentaireCollection commentaireCollection = new CommentaireCollection();
        Commentaire commentaire1 = new Commentaire(user1, "Ceci est un commentaire.");
        Commentaire reponse1 = new Commentaire(user2, "Ceci est une réponse.");
        commentaire1.addReponse(reponse1);
        commentaireCollection.add(commentaire1);

        // Parcourir et afficher les commentaires (DFS)
        PostIterator<Commentaire> commentaireIteratorDFS = commentaireCollection.createIterator();
        System.out.println("Parcours DFS des commentaires :");
        while (commentaireIteratorDFS.hasNext()) {
            Commentaire commentaire = (Commentaire) commentaireIteratorDFS.getNext();
            System.out.println(commentaire.getBody());
        }

        // Parcourir et afficher les commentaires (BFS)
        PostIterator<Commentaire> commentaireIteratorBFS = commentaireCollection.createIteratorBFS();
        System.out.println("Parcours BFS des commentaires :");
        while (commentaireIteratorBFS.hasNext()) {
            Commentaire commentaire = (Commentaire) commentaireIteratorBFS.getNext();
            System.out.println(commentaire.getBody());
        }
    }
}
    

