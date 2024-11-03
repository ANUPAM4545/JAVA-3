// INHERITENCE; we use 'EXTENDS' keyword to inherit properties of parent class in child class.
class parent{
int property=500;
public void pintro(){
    System.out.println("i am parent class");
}

}
// we can use all the properties of parent class in child class , here we are using 'property'in child class.

// here we are using extends keyword to inherit properties of parent class in child class.
class child extends parent{
    int cproperty=100;
    public void mymoney(){
        int tm=property+cproperty;
        System.out.println("my total money is "+tm);
    }
    
    }
public class InheritencePractic {
    public static void main(String[] args) {
        child child1=new child();

        child1.pintro();
        child1.mymoney();
    }
}
