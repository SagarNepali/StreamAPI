package callbacks;

import java.util.function.Consumer;

public class _Callbacks {

     public static void main(String[] args) {

        hey("RAM", null, s -> {
            System.out.println("lastname is null");
        });

        hey2("FirstName","LastName", ()->{
            System.out.println("lastname is null");
        });


    }


    static void hey(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) System.out.println(lastName);
        else callback.accept(firstName);
    }

    static void hey2(String firstName, String lastName, Runnable callback){
        System.out.println(firstName);
        if (lastName != null) System.out.println(lastName);
        else callback.run();
    }

}
