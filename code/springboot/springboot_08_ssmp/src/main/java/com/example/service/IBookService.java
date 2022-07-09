package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;

public interface IBookService extends IService<Book> {

    public Boolean modify(Book book);

    public Boolean delete(Integer id);

    IPage<Book> getPage(int currentPage, int pageSize, Book book);

    IPage<Book> getPage(int currentPage, int pageSize);

}
