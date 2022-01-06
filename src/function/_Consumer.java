package function;

import java.util.function.Consumer;

public class _Consumer {

    //Represents an operation that accepts a single input argument and returns no result.

    public static void main(String[] args) {

        //normal style java function
        greetTaruni(new Taruni("Sweety","911"));

        //consumer style java function
        greetTaruniWithConsumerFunction.accept(new Taruni("Sexxayy","69"));

    }

    static void greetTaruni(Taruni c){
        System.out.println("Hi "+c.name+ ", is this your number? "+c.phoneNumber);


    }

    static Consumer<Taruni> greetTaruniWithConsumerFunction =
            taruni -> System.out.println("Hi "+taruni.name+", phone? "+taruni.phoneNumber);

    static class Taruni{

        private String name;
        private String phoneNumber;

        public Taruni(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
