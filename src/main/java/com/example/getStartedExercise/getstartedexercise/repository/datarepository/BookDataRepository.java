package com.example.getStartedExercise.getstartedexercise.repository.datarepository;

import java.util.List;
import java.util.Optional;

import com.example.getStartedExercise.getstartedexercise.repository.model.Book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * BookDataRepository
 */
@Repository
@RepositoryRestResource(exported = false)
public interface BookDataRepository extends JpaRepository<Book, Integer> {
	
	//@RestResource(path = "status", rel = "findByStatus" )
	List<Book> findByStatus(@Param("status")Integer status);

	List<Book> findByTitleLikeAndStatus(String string, int i);

	List<Book> findByTitleLikeAndCategoryAndStatus(String title, int category_id, int i);

	List<Book> findByTitleLikeAndCategoryIdAndStatus(String title, int category_id, int i);

	Optional<Book> findById(Integer id);
    
}