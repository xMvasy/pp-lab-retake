    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
    
    public class Main {
        private static final BookManager bookManager;
    
        static {
            List<Book> initialBooks = new ArrayList<>();
            initialBooks.add(new Book("Book 1", "Author 1", "ISBN001", 2001));
            initialBooks.add(new Book("Book 2", "Author 2", "ISBN002", 2002));
            initialBooks.add(new Book("Book 3", "Author 3", "ISBN003", 2003));
            initialBooks.add(new Book("Book 4", "Author 4", "ISBN004", 2004));
            initialBooks.add(new Book("Book 5", "Author 5", "ISBN005", 2005));
            bookManager = new BookManager(initialBooks);
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Menu:");
                System.out.println("[1] Add book");
                System.out.println("[2] Remove book");
                System.out.println("[3] Update book");
                System.out.println("[4] List books");
                System.out.println("[5] Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter ISBN: ");
                        String isbn = scanner.nextLine();
                        System.out.print("Enter year: ");
                        int year = scanner.nextInt();
                        scanner.nextLine();
                        bookManager.addBook(new Book(title, author, isbn, year));
                        break;
                    case 2:
                        System.out.print("Enter ISBN of the book to remove: ");
                        String isbnToRemove = scanner.nextLine();
                        bookManager.removeBook(isbnToRemove);
                        break;
                    case 3:
                        System.out.print("Enter ISBN of the book to update: ");
                        String isbnToUpdate = scanner.nextLine();
                        System.out.print("Enter new title: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("Enter new author: ");
                        String newAuthor = scanner.nextLine();
                        System.out.print("Enter new year: ");
                        int newYear = scanner.nextInt();
                        scanner.nextLine();
                        bookManager.updateBook(new Book(newTitle, newAuthor, isbnToUpdate, newYear));
                        break;
                    case 4:
                        List<Book> books = bookManager.getBooks();
                        for (Book book : books) {
                            System.out.println(book);
                        }
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }
    }
    

