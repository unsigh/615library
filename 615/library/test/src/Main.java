import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;
import java.util.*;
public class Main {
    public static User login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        String name=scanner.nextLine();

        System.out.println("请输入你的身份，1：管理员  2：普通用户");

        int choice= scanner.nextInt();

        if(choice==1){
            return new AdminUser(name);
        }else{
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList=new BookList();

        User user=login();

        while(true) {
            int choice = user.menu();

            user.doIoperation(choice, bookList);

        }
    }
}
