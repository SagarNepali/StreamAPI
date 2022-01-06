package function;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    //Represents a predicate (boolean-valued function) of one argument.

    public static void main(String[] args) {

        System.out.println("Without Predicate..");
        System.out.println(isTaruniHot("***"));
        System.out.println(isTaruniHot("******"));

        System.out.println("With Predicate..");
        System.out.println(isTaruniHotWithPredicates.test("***"));
        System.out.println(isTaruniHotWithPredicates.test("******"));

        System.out.println(isTaruniHotWithPredicates.and(isTaruniTooCute).test("*****"));
        System.out.println(isTaruniHotWithPredicates.and(isTaruniTooCute).test("******"));

        System.out.println(isTaruniHotAndCuteBiPredicate.test("*****","******"));

    }

    static boolean isTaruniHot(String hotness){
        return hotness.contains("*") && hotness.length() > 5 ;
    }

    static Predicate<String> isTaruniHotWithPredicates =
            hotmeterString -> hotmeterString.startsWith("*") && hotmeterString.endsWith("*") && hotmeterString.length()>5;

    static Predicate<String> isTaruniTooCute =
            cuteMeter -> cuteMeter.length()>5;

    static BiPredicate<String, String> isTaruniHotAndCuteBiPredicate =
            (hotMeter,cuteMeter) ->
                    hotMeter.contains("*") && cuteMeter.length() > 5;
}
