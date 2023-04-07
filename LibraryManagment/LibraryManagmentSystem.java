package LibraryManagment;

import java.util.ArrayList;

public class LibraryManagmentSystem {
        private ArrayList<Book> books = new ArrayList<>();
        private int nextBookId = 1;

        public void addBook(String title, String author) {
            Book book = new Book(nextBookId++, title, author);
            books.add(book);
            System.out.println("Book added: " + book);
        }

        public void displayAllBooks() {
            System.out.println("All Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }

        public void displayBook(int bookId) {
            for (Book book : books) {
                if (book.getBookId() == bookId) {
                    System.out.println("Book found: " + book);
                    return;
                }
            }
            System.out.println("Book not found for bookId: " + bookId);
        }

        public void issueBook(int bookId) {
            for (Book book : books) {
                if (book.getBookId() == bookId) {
                    if (book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("Book issued: " + book);
                        return;
                    } else {
                        System.out.println("Book not available for bookId: " + bookId);
                        return;
                    }
                }
            }
            System.out.println("Book not found for bookId: " + bookId);
        }

        public void returnBook(int bookId) {
            for (Book book : books) {
                if (book.getBookId() == bookId) {
                    if (!book.isAvailable()) {
                        book.setAvailable(true);
                        System.out.println("Book returned: " + book);
                        return;
                    } else {
                        System.out.println("Book already available for bookId: " + bookId);
                        return;
                    }
                }
            }
            System.out.println("Book not found for bookId: " + bookId);
        }
    }

