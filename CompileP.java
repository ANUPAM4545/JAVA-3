// 2. POLYMORPHISM; 
//method behaves differently in different situations.

// COMPILE METHOD;
class calculate{
    public void sum(int a, int b){
        
    } 
    public void sum(int a, int b, int c){
        System.out.println(+(a+b+c));
}
}

public class CompileP {
    public static void main(String[] args) {
        
        calculate obj=new calculate();
        obj.sum(10,20);
        obj.sum(10,20,30);
    }
}
