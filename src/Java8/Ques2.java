package Java8;

interface FunctionalInterface{
    void operation(int a,int b);
}
public class Ques2 {
    public static void main(String[] args) {
        FunctionalInterface performOperation= FunctionInterface::staticAdd;
        performOperation.operation(2,3);

        performOperation = new FunctionInterface()::instanceAdd;
        performOperation.operation(4,3);

        performOperation=FunctionInterface::staticSubtract;
        performOperation.operation(7,3);

        performOperation=new FunctionInterface()::instanceSubtract;
        performOperation.operation(8,2);
    }
}
