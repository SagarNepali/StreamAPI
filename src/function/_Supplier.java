package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDBConnectionURL());

        System.out.println(dbUrlSupplier.get());
    }

    static String getDBConnectionURL() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> dbUrlSupplier =
            () -> Arrays.asList("jdbc://localhost:5432/users/suppliers", "assd");
}
