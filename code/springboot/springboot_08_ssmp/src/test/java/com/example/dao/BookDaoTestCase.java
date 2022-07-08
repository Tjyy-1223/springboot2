package com.example.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(3));
    }

    @Test
    void testSave(){
        System.out.println(bookDao.selectById(3));
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setType("test 123");
        book.setName("test name");
        book.setDescription("test description");

        bookDao.insert(book);
    }

    @Test
    void testGetAll(){
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetPage(){
        IPage page = new Page(1,5);
        bookDao.selectPage(page,null);
    }

    @Test
    void testSelectByCondition(){
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(false,"name",null);

        bookDao.selectList(queryWrapper);
    }
}
