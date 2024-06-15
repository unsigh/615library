package ioperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("删除图书.....");

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你删除的书名：");
        String name= scanner.nextLine();

        int currentSize= bookList.getUsedSize();

        int pos=-1;

        int i=0;
        for ( i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println("找到了这本书：");
                pos=i;
                break;
            }
        }

        if (i==currentSize){
            System.out.println("没有你要删除的书！");
            return;
        }

        for (int j = pos; j < currentSize-1; j++) {
            Book book=bookList.getBook(j+1);

            bookList.setBook(j,book);
        }

        bookList.setBook(currentSize-1,null);

        bookList.setUsedSize(currentSize-1);
        System.out.println("删除成功！！！！");
    }
}
