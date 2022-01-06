package function;

import java.util.function.Function;

public class _Function {

    //Represents a function that accepts one argument and produces a result.

    public static void main(String[] args) {

        Function<Integer,Integer> num = number -> number + 1;

        System.out.println("Add 1 to the number given using function lambda: "+num.apply(0));

        System.out.println("Multiply by 1 using function :"+multiplyByFiveFunction.apply(1));

        Function<Integer,Integer> addOneAndMultiplyByFive = addOneToTheNumber.andThen(multiplyByFiveFunction);

        System.out.println("Add One and multiply by 5 using chained functions: "+addOneAndMultiplyByFive.apply(0 ));
    }


    static Function<Integer,Integer> addOneToTheNumber = number -> number +1 ;

    static Function<Integer,Integer> multiplyByFiveFunction = number -> number * 5;
}
