package LibraryManagment;

public class Main {
        public static void main(String[] args) {
            LibraryManagmentSystem libraryManagementSystem = new LibraryManagmentSystem();

            libraryManagementSystem.addBook("The Great Gatsby", "F. Scott Fitzgerald");
            libraryManagementSystem.addBook("To Kill a Mockingbird", "Harper Lee");

            libraryManagementSystem.displayAllBooks();

            libraryManagementSystem.issueBook(1);
            libraryManagementSystem.issueBook(1);

            libraryManagementSystem.returnBook(1);
            libraryManagementSystem.returnBook(2);

            libraryManagementSystem.displayAllBooks();
        }
    }
