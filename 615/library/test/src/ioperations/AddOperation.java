package ioperations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("新增图书.....");

        int currentSize = bookList.getUsedSize();
        if(currentSize == bookList.getBooks().length){
            System.out.println("书架满了 不能放了.....");
            return;
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = scanner.nextLine();

        System.out.println("请输入作者：");
        String author = scanner.nextLine();

        System.out.println("请输入价格：");
        int price = scanner.nextInt();

        System.out.println("请输入书的类型：");
        String type = scanner.nextLine();

        Book newBook=new Book(name,author,price,type);

        for (int i = 0; i < currentSize; i++) {
            Book book=bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("有这本书不能插入！");
                return;
            }
        }

        bookList.setBook(currentSize,newBook);

        bookList.setUsedSize(currentSize+1);

        System.out.println("新增图书成功！！！");

    }
}

