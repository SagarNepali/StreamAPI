package function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _BiConsumer {
    //Represents an operation that accepts two input arguments and returns no result.
    public static void main(String[] args) {

        //normal style java function
        greetTaruni(new _BiConsumer.Taruni("Sweety","911"));

        //bi consumer style java function
        greetTaruniWithConsumerFunction.accept(new _BiConsumer.Taruni("Sexxayy","69"),false);
        greetTaruniWithConsumerFunction.accept(new _BiConsumer.Taruni("Sexxayy","69"),true);

    }

    static void greetTaruni(_BiConsumer.Taruni c){
        System.out.println("Hi "+c.name+ ", is this your number? "+c.phoneNumber);


    }

    static BiConsumer<Taruni,Boolean> greetTaruniWithConsumerFunction =
            (taruni,showNumber) -> System.out.println("Hi "+taruni.name+", phone? "+ (showNumber ? taruni.phoneNumber: "*******") );

    static class Taruni{

        private String name;
        private String phoneNumber;

        public Taruni(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

}
