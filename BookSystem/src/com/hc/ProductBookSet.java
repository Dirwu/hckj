package com.hc;

import java.util.Vector;

public class ProductBookSet {

    public static Vector v = new Vector();


    public boolean insert(){
        String name = ConsoleInout.inputString("书名");
        String author = ConsoleInout.inputString("作者");
        String publisher = ConsoleInout.inputString("出版社");
        double price = ConsoleInout.inputDouble("价格");
        ProductBooks productBooks = new ProductBooks(name,author,price,publisher);
        if(isEmpty()){
            productBooks.setAmount(1);
            ProductBookSet.v.add(productBooks);
        }else {
            //如果不重复，插入新的
                if(!isExist(productBooks)){
                    productBooks.setAmount(1);
                    ProductBookSet.v.add(productBooks);
                }
        }
        System.out.println("插入书本成功");
        return false;
    }

    public boolean findById (int id){
        for(Object obj :ProductBookSet.v){
            boolean key = (((ProductBooks)obj).getId()) == id;
            if(key){
                int x_id = ProductBookSet.v.indexOf(obj)+1;
                System.out.println("序号 "+x_id+" "+((ProductBooks)obj).toString());
            }
        }
        return false;
    }
    public boolean findByName (String name){
        for(Object obj :ProductBookSet.v){
            boolean key = (((ProductBooks)obj).getName()).equals(name);
            if(key){
                int x_id = ProductBookSet.v.indexOf(obj)+1;
                System.out.println("序号 "+x_id+" "+((ProductBooks)obj).toString());
            }
        }
        return false;
    }
    public boolean findByAuthor(String author){
        for(Object obj :ProductBookSet.v){
            boolean key = (((ProductBooks)obj).getAuthor()).equals(author);
            if(key){
                int x_id = ProductBookSet.v.indexOf(obj)+1;
                System.out.println("序号 "+x_id+" "+((ProductBooks)obj).toString());
            }
        }
        return false;
    }
    public boolean findByPublisher(String publisher){
        for(Object obj :ProductBookSet.v){
            boolean key = (((ProductBooks)obj).getPublisher()).equals(publisher);
            if(key){
                int x_id = ProductBookSet.v.indexOf(obj)+1;
                System.out.println("序号 "+x_id+" "+((ProductBooks)obj).toString());
            }
        }
        return false;
    }
    public boolean findByPriceRange (double begin,double end){
        double temp = 0.0;
        if(begin>end){
            temp = begin;
            begin = end;
            end = temp;
        }
        for(Object obj :ProductBookSet.v){
            boolean key1 = (((ProductBooks)obj).getPrice()) > begin;
            boolean key2 = (((ProductBooks)obj).getPrice()) < end;
            if(key1&&key2){
                int x_id = ProductBookSet.v.indexOf(obj)+1;
                System.out.println(("序号 "+x_id+" "+(ProductBooks)obj).toString());
            }
        }
        return false;
    }
    public boolean findAll (){
        for(Object obj :ProductBookSet.v){
            int x_id = ProductBookSet.v.indexOf(obj)+1;
            System.out.println("序号 "+x_id+" "+((ProductBooks)obj).toString());
        }
        System.out.println(ProductBookSet.v.size());
        return false;
    }

    public boolean deleteById (int id){
        for(Object obj :ProductBookSet.v){
            boolean key = (((ProductBooks)obj).getId()) == id;
            if(key){
                ProductBookSet.v.remove(obj);
                System.out.println("删除成功");
            }
        }

        return false;
    }
    public boolean deletedByName(String name){
        for(Object obj :ProductBookSet.v){
            boolean key = (((ProductBooks)obj).getName()).equals(name);
            if(key){
                ProductBookSet.v.remove(obj);
                System.out.println("删除成功");
            }
        }

        return  false;
    }
    public boolean deleteByAuhor(String author){
        for(Object obj :ProductBookSet.v){
            boolean key = (((ProductBooks)obj).getAuthor()).equals(author);
            if(key){
                ProductBookSet.v.remove(obj);
                System.out.println("删除成功");
            }
        }

        return false;
    }
    public boolean deleteByPublisher(String publisher){
        for(Object obj :ProductBookSet.v){
            boolean key = (((ProductBooks)obj).getPublisher()).equals(publisher);
            if(key){
                ProductBookSet.v.remove(obj);
                System.out.println("删除成功");
            }
        }
        return false;
    }
    public boolean deleteByPrice(double begin,double end){
        double temp = 0.0;
        if(begin>end){
            temp = begin;
            begin = end;
            end = temp;
        }
        for(Object obj :ProductBookSet.v){
            boolean key1 = (((ProductBooks)obj).getPrice()) > begin;
            boolean key2 = (((ProductBooks)obj).getPrice()) < end;
            if(key1&&key2){
                ProductBookSet.v.remove(obj);
                System.out.println("删除成功");
            }
        }
        return  false;
    }
    public boolean deletaAll(){
        for(Object obj :ProductBookSet.v){
            ProductBookSet.v.remove(obj);
        }
        System.out.println("所有删除成功");
        return false;
    }
    public boolean isExist(ProductBooks productBooks){
        //判断是否为重复的书
        //如果书名，作者,出版社相同，则增加他们的amout,否则新增进去
        for(Object obj : ProductBookSet.v){
            boolean ke1 = ((ProductBooks)obj).getName().equals(productBooks.getName());
            boolean ke2 = ((ProductBooks)obj).getAuthor().equals(productBooks.getAuthor());
            boolean ke3 = ((ProductBooks)obj).getPublisher().equals(productBooks.getPublisher());
            if(ke1&&ke2&&ke3){
                ((ProductBooks)obj).setAmount(((ProductBooks)obj).getAmount()+1);
                return true;
            }
        }
        return false;
    }
    public boolean isEmpty(){
        return ProductBookSet.v.isEmpty();
    }
    public int size(){
        return ProductBookSet.v.size();
    }
    public boolean update (int index){
            ProductBooks p = (ProductBooks)ProductBookSet.v.get(index-1);
            String name = ConsoleInout.inputString("输入书名");
            p.setName(name);
            String author = ConsoleInout.inputString("输入作者");
            p.setAuthor(author);
            String publisher = ConsoleInout.inputString("输入出版社");
            p.setPublisher(publisher);
            double price = ConsoleInout.inputDouble("输入价格");
            p.setPrice(price);
            System.out.println("修改成功");
        return false;
    }
}
