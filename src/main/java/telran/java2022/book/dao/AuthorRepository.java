package telran.java2022.book.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import telran.java2022.book.model.Author;
import telran.java2022.book.model.Publisher;

public interface AuthorRepository  {

	Optional<Author> findById(String authorName);
	
	Author save(Author author);

	void delete(Author author);
		
}
