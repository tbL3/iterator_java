public interface PostCollection<T> {
    int getSize();
    boolean add(T newPost);
    PostIterator<T> createIterator();
}
