public final class OuterClass {

    public int x = 10;

    public class InnerClass {
        int y = 5;
    }

    public void showNumbers(){
        System.out.println(x + new InnerClass().y);
    }

//    public static class InnerClass {
//        int y = 5;
//
//        public void sum() {
//            System.out.println(new InnerClass().y + new OuterClass().x);
//        }
//    }

//    public class InnerClass {
//        public int myInnerMethod() {
//            return x;
//        }
//    }

}
