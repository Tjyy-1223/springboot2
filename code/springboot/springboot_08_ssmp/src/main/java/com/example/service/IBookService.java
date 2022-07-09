package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;
import com.sun.org.apache.xpath.internal.operations.Bool;

public interface IBookService extends IService<Book> {

    public Boolean modify(Book book);

    public Boolean delete(Integer id);

    IPage<Book> getPage(int currentPage,int pageSize);
}
