package com.example.book_management.book_management.controller;

import com.example.book_management.book_management.dto.BaseResponse;
import com.example.book_management.book_management.model.Book;
import com.example.book_management.book_management.repository.BooksRepository;
import com.example.book_management.book_management.repository.GroupBookRepository;
import com.example.book_management.book_management.exceptions.BadRequestExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class BooksController {
    @Autowired
    BooksRepository booksRepository;
    @Autowired
    GroupBookRepository groupBookRepository;

    @GetMapping("/books")
    public List<Book> getAllListBook() {
        return booksRepository.getAllListBook();
    }

    @PostMapping("/books")
    public ResponseEntity addBook(@RequestBody Book book) throws ParseException, BadRequestExceptions {

        if (book.getBookName().length() > 25) {
            throw new BadRequestExceptions("Vượt quá ký tự ", 1213);
        }
        List<Book> bookOptional = booksRepository.getListNameBook(book.getBookName());
        if (bookOptional != null || !bookOptional.isEmpty()) {

            throw new BadRequestExceptions("Tên đã tồn tại", 1020);

        } else {
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("Thêm thành công");
            baseResponse.setCode(4);
            return ResponseEntity.ok(baseResponse);
        }
    }

    @PutMapping("/books/{id}")
    public Book editBook(@PathVariable(name = "id") Integer id, @RequestBody Book book) throws BadRequestExceptions {
        if (booksRepository.findBookByid(id) == null) {
            throw new BadRequestExceptions("Không tìm thấy Id " + id, 1213);
        }
        book.setId(id.intValue());
        booksRepository.save(book);
        return book;
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity deleteBookbyId(@PathVariable(name = "id") Integer id) throws BadRequestExceptions {
        Book book = booksRepository.findBookByid(id);
        if (booksRepository.findBookByid(id) == null) {
            throw new BadRequestExceptions("Không tìm thấy Id: " + id, 1214);
        }
        book.setBookStatus(true);
        booksRepository.save(book);
        return ResponseEntity.ok().build();
    }
}
