public interface PostCollection {

    int getSize();

    void add(Object newPost);

    PostIterator createIterator();
}
