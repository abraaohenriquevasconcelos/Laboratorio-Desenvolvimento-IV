package spring.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import spring.model.Livro;

public interface LivroRepository extends CrudRepository<Livro, Long> {
	Livro findById(Long id);
	List<Livro> findAll();
}
