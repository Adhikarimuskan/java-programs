public class polymorphism {
    class Student {
        void show(String name){
         System.out.println("1");
        }
        void show(int a){
         System.out.println("2");
        }
        public static void main(String[] args){
          Student s1=new Student ();
         s1.show();
        }
     }
     
     
}
