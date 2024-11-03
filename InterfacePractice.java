//2. INTERFACES;
// ex; of default keyword;

interface Contract{
    abstract void rules();
}

class Institute implements Contract{

    String name="xyz";
    public void rules(){
        System.out.println("Conduct Exams");
}
}

public class InterfacePractice {
    public static void main(String[] args) {
        Institute obj=new Institute();
        obj.rules();
        System.out.println("Institute name  is "+obj.name );
    }
}
