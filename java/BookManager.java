    import java.util.ArrayList;
    import java.util.List;
    
    public class BookManager implements BookOperations {
        private List<Book> books;
    
        public BookManager(List<Book> books) {
            this.books = books;
        }
    
        @Override
        public void addBook(Book book) {
            books.add(book);
        }
    
        @Override
        public void removeBook(String isbn) {
            books.removeIf(book -> book.getIsbn().equals(isbn));
        }
    
        @Override
        public void updateBook(Book book) {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getIsbn().equals(book.getIsbn())) {
                    books.set(i, book);
                    break;
                }
            }
        }
    
        @Override
        public List<Book> getBooks() {
            return new ArrayList<>(books);
        }
    }
        
