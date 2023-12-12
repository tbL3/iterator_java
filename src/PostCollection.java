public interface PostCollection {

    int getSize();

    boolean add(Object newPost);

    PostIterator createIterator();
}
