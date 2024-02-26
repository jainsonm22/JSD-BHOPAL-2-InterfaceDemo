public class DemoClass_1 implements Interface_2 {

    String username;

    @Override
    public void print() {
        System.out.println("Hello from Demo class 1 " + username);
    }

    @Override
    public String EnterData(String var1) {
        username = var1;
        return username;
    }
}
