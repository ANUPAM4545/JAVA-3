// 2. POLYMORPHISM; 
//method behaves differently in different situations.

// method overriding;
//same method in  parent and child class, then method available in child class will over ride parent class method.
class parent{
    public void home(){
        System.out.println("this is parent home");
    }
}

class child extends parent{
    public void home(){
        System.out.println("this is child home"); 
    }
}




public class RuntimeP {
   public static void main(String[] args) {
     child obj=new child();
     obj.home();
   } 
}
