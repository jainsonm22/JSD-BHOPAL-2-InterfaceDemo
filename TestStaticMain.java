public class TestStaticMain {
    public static void main(String[] args) {
        StaticInterFaceDemo obj1 = new StaticInterfaceClass();
        obj1.DemoData();
        System.out.println(StaticInterFaceDemo.myInterfaceMetyhod("user1"));
        System.out.println(StaticInterFaceDemo.MyMethod());
    }
}
