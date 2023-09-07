

 class A {
    void show(){
        System.out.println("hello man");
    } 
}
class B extends A{
     void show1(){
        System.out.println("hello");
        
    }
}

class c{
    public static void main(String args[]) {
        B ref=new B();
        ref.show1();
    }
}
