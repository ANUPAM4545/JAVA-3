// WE CAN USE ABSTRACTION IN TWO WAYS;

//1. USING ABSTRACT KEYWORD;

//2. USING DEFAULT KEYWORD;

//  ABSTRACTION;
//hiding unnecessary details.

// here , we use abstract keyword to hide the details.

// we must have abstract class if we want to use abstract keyword.

// 1. EX; OF ABSTRACT KEYWORD;
abstract class hotel{
    abstract void legacy();
    int revenue=10000;
}

class staff extends hotel{
    public void legacy(){
        System.out.println("hello sir");
}
}
public class AbstractionPractice {
    public static void main(String[] args) {
        staff obj=new staff();
        obj.legacy();
        System.out.println("revenue  "+obj.revenue);
    }
}

//2. INTERFACES;
// ex; of default keyword;

