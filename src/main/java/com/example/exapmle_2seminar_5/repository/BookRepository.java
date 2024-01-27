package com.example.exapmle_2seminar_5.repository;

import com.example.exapmle_2seminar_5.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
