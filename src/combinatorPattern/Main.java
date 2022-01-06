package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Ram",
                "ram@miu.edu",
                "098412345",
                LocalDate.of(2015,04,22)
        );

        CustomerValidatorService service = new CustomerValidatorService();
        System.out.println(service.isValid(customer));

        //Using Combinator pattern
        ValidationResult result = isEmailValid()
                .and(isAnAdult())
                .and(isPhoneNumberValid())
                .apply(customer);

        System.out.println(result);
        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException("Not a valid customer");
        }
    }
}
