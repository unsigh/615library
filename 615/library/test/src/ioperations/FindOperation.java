package ioperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("查找图书.....");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的书名：");
        String name= scanner.nextLine();

        int currentSize= bookList.getUsedSize();

        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println("找到了这本书：");
                System.out.println(book);
                return;
            }
            System.out.println("没有你要找的这本书....");
        }
    }
}
