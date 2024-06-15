package ioperations;

import book.BookList;

public class ExitOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("退出图书.....");
        System.exit(0);
    }
}
