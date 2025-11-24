package ibookseviceimpl;

import book.Book;
import ibookservice.IBookService;

import java.util.ArrayList;
import java.util.List;

public class IBookServiceImpl implements IBookService {
    private List<Book> books;

    public void IBookService() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Book getBookById(String id) {
        for (Book x : books) {
            if (x.getId().equals(id)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public List<Book> getAllBooksByCategory(Object category) {
        List<Book> result = new ArrayList<>();
        if (category instanceof Class<?>) {
            Class<?> c = (Class<?>) category;
            for (Book x : books) {
                if (c.isInstance(x)) {
                    result.add(x);
                }
            }
        }
        return result;
    }

    @Override
    public boolean deleteBookById(String id) {
        Book x = getBookById(id);
        if (x != null) {
            books.remove(x);
            return true;
        }
        return false;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public double calculateTotalValue() {
        double total = 0;
        for (Book x : books) {
            total += x.getPrice() * x.getQuantity();
        }
        return total;
    }
}
