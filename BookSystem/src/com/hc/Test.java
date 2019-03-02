package com.hc;

import com.dao.BooksDao;

public class Test {
    public static void main(String[] args) {
        BooksDao booksDao = new BooksDao();
        String sql = "INSERT INTO book_product (id,book_name,author,summary,price,publisher,amount) VALUES(1008,'无敌青哥','吴青','一本炼体的书',225.6,'邮政出版社',1)";
        String sql2 = "INSERT INTO book_product (id,book_name,author,summary,price,publisher,amount) VALUES(1008,'青哥无敌','吴青','一本修仙的书',122.6,'人民出版社',2)";
        booksDao.inserts(sql);
        booksDao.inserts(sql2);
        String sql3 = "SELECT * FROM book_product";
        booksDao.selects(sql3);

    }
}