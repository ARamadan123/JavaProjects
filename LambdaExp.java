// Lambda Expressions
public class LambdaExp
{
    public static void main(String[] argv)
    {
        String msg = "This is a Lambda Expression";

        MyInterface myInterface = (text) -> System.out.println(text);
        MyInterface myInterface2 = (text) -> System.out.println(text + "->" + text);

        myInterface.doSomething(msg);
        myInterface2.doSomething(msg);
    }
}

@FunctionalInterface
interface MyInterface {
    void doSomething(String text);    
}
