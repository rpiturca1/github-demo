//public class TestClass {
//    public static void main(String[] args) throws Exception { boolean flag = true;
//        if (flag){
//            System.out.println("true");}
//
//            else {System.out.println("false"); }
//    } }


public class TestClass {
    //define tester method here
    public boolean tester(){
        return false;
    }
    public static void main(String[] args) throws Exception { TestClass tc = new TestClass();
        while(tc.tester()){
            System.out.println("running..."); } } }