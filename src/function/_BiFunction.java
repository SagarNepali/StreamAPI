package function;

import java.util.function.BiFunction;

public class _BiFunction {

    // Takes two arguments in BiFunction and every other functions of java.util.function with Bi* functions

    //Represents a function that accepts two arguments and produces a result.

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> biFunction = (x,y) -> x + y;

        System.out.println("Bifunction to add 2 integers: "+biFunction.apply(2,2));

        BiFunction<Integer,Integer,Integer> addOneAndMultiplyByFunction =
                /* These are parameters */(addOne, multipliedBy)
                /* Function body/ block  */-> (addOne+1) * multipliedBy;

        System.out.println("BiFunctionally adding 1 to first number and then multiplying using the multiplier: "
                +addOneAndMultiplyByFunction.apply(1,2));
    }
}
