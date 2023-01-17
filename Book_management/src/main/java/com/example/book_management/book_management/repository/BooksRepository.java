package com.example.book_management.book_management.repository;

import com.example.book_management.book_management.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book,Integer> {
    @Query("SELECT b FROM Book b ")
    public List<Book> getAllListBook();
    @Query("SELECT b FROM Book b Where b.id = ?1")
    public Book findBookByid(Integer id);
   @Query("SELECT b From Book b where b.idGroupBook =?1")
    public List<Book> getListGroupBookById(Integer idGroupBook);
   @Query("SELECT b From Book b where b.bookName=?1 ")
   public List<Book> getListNameBook(String bookName);
}
