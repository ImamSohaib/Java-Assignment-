class Student{
    int id;
    String name;
    Student(){
id=0;
name="No Name";
    }
Student(int i,String n){
    id=i;
    name=n;
}
void display(){
    System.out.println("Student ID:"+id);
    System.out.println("Student Name:"+name);
}
}
public class ConstructorOverloadingDemo{
public static void main(String[] args) {
    Student s1=new Student();
    s1.display();
    System.out.println();
    Student s2=new Student(135,"Sohaib");
    s2.display();
}

}
