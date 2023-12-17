import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Commentaire {
    private String body;
    private User user;
    private List<Commentaire> anwser = new ArrayList<>();

    public Commentaire(User user, String body){
        this.user = user;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void addAnwser(Commentaire anwser){
        this.anwser.add(anwser);
    }

    public void addReponse(Commentaire reponse) {
        anwser.add(reponse);
    }

    public List<Commentaire> getReponses() {
        return anwser;
    }

}
