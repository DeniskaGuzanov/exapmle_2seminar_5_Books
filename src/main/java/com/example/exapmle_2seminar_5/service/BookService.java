package com.example.exapmle_2seminar_5.service;

import com.example.exapmle_2seminar_5.model.Book;
import com.example.exapmle_2seminar_5.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository repository;
    public List<Book> getAllBooks(){
        return repository.findAll();
    }

    public Optional<Book> getBookById(Long id){
        return repository.findById(id);
    }

    public Book createBook(Book book){
        return repository.save(book);
    }

    public Book updateBook(Long id,Book bookDetails){
        Optional<Book> optionalBook = repository.findById(id);
        if(optionalBook.isPresent()){
            Book book = optionalBook.get();
            book.setTitle(bookDetails.getTitle());
            book.setAuthor(bookDetails.getAuthor());
            book.setPublicationYear(bookDetails.getPublicationYear());
            return repository.save(book);
        }else {
            throw new IllegalArgumentException("Book not found with id:");
        }
    }

    public void deleteBook(Long id){
        repository.deleteById(id);
    }

}
