package user;

import book.BookList;
import ioperations.IOperation;

public abstract class User  {
    protected String name;
    protected IOperation [] ioPerations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doIoperation (int choice,BookList bookList){
        ioPerations[choice].work(bookList);
    }







}
