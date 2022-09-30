package Java8;
import java.util.function.*;
public class Ques1 {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> isGreater=(a,b)->{
            if(a>b)
                return true;
            return false;
        };
        System.out.println(isGreater.test(18,12));

        BiConsumer<String,String> concatString = (string1,string2)->{
            System.out.println(string1+string2);
        };
        concatString.accept("vikash","Rai");

        Consumer<String>  convertTOUpperCase=string-> System.out.println(string.toUpperCase());
        convertTOUpperCase.accept("vikash");

        Consumer<Integer> incrementByOne = a -> System.out.println(a+1);
        incrementByOne.accept(2);



    }
}
