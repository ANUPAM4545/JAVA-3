// OOPS - OBJECT ORIENTED PROGRAMMING STYLE.
// CONCEPTS;

// 1. INHERITANCE;
//inheriting properties of parent class in child class.

// 2. POLYMORPHISM; 
//method behaves differently in different situations.

// 3. ABSTRACTION;
//hiding unnecessary details.

// 4. ENCAPSULATION; 
//hiding properties into single unit.

//5.OBJECT; instansce of class.

//6.CLASS; it is a blueprint of methods and properties.

//Q. EXAMPLE OF CLASSES, OBJECTS, AND ENCAPSULATION.
class Student{
    String name;
    int rollno;
    public Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
}
public class Oopsrevision{

  
public static void main(String[] args) {
Student std1=new Student("anupam",1);
Student std2=new Student("anurag",2);
System.out.println(std1.name+" "+std2.name);
}
}

// INHERITENCE; we use 'EXTENDS' keyword to inherit properties of parent class in child class.