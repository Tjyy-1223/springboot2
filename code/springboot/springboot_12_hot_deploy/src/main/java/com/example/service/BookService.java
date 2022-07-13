package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getByPage(int currentPage,int PageSize);
}