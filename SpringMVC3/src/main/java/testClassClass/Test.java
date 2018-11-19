package testClassClass;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {

    Class temp1 = Class.forName("java.lang.String");
    Class temp2 = Integer.class;
        System.out.println(temp1.getClasses().length);
        System.out.println(temp1);
        System.out.println(temp2);
    }
}
