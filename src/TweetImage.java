public class TweetImage extends Tweet {
    private int resolutionX;
    private int resolutionY;

    public TweetImage(User user, int resolutionX, int resolutionY) {
        super(user, "je suis une image");
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public void display() {
        System.out.println("je suis une image de " + resolutionX + "x" + resolutionY);
    }
    
}
