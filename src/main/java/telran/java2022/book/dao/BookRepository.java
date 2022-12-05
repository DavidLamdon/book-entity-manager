package telran.java2022.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import telran.java2022.book.model.Book;
import telran.java2022.book.model.Publisher;

public interface BookRepository  {
	
	Stream<Book> findByAuthorsName(String authorName);


	Stream<Book> findByPublisherPublisherName(String publisherName);


	boolean existsById(String isbn);


	Optional<Book> findById(String isbn);


	Book save(Book book);


	void deleteById(String isbn);

	
}
