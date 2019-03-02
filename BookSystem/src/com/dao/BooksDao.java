package com.dao;

import com.hc.ProductBooks;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BooksDao extends C3p0Dao{
    public void selects(String sql){
        List<ProductBooks> list = null;
        try {
            list = this.dql(sql);
            for(ProductBooks productBooks:list){
                System.out.println(productBooks);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void inserts(String sql){
        int num = this.dml(sql);
        System.out.println("成功插入"+num+"条");
    }
    @Override
    public List resList(ResultSet res) {
        List<ProductBooks> list = new ArrayList();

            try {
                while (res.next()){
                    String name = res.getString("book_name");
                    String author = res.getString("author");
                    String summary = res.getString("summary");
                    double price = res.getDouble("price");
                    String publisher = res.getString("publisher");
                    int amount = res.getInt("amount");

                    ProductBooks productBooks = new ProductBooks();
                    productBooks.setId();
                    productBooks.setName(name);
                    productBooks.setAuthor(author);
                    productBooks.setSummary(summary);
                    productBooks.setPrice(price);
                    productBooks.setPublisher(publisher);
                    productBooks.setAmount(amount);

                    list.add(productBooks);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        return list;
    }
}
