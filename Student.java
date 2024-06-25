public class Student {
    public Student(){
        System.out.println("Creating object");
    }
    public void sayhello(){
     System.out.println("I am a student");
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.sayhello();
       
    }
}
