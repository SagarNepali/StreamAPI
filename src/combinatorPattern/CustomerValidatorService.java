package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    public boolean isEmailValid(String email){
        return email.contains("@") ;
    }

    public boolean isPhoneValid(String phoneNumber){
        return phoneNumber.startsWith("0")
                && phoneNumber.length()==9;
    }

    public boolean isAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears()>16;
    }

    public boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail())
                && isPhoneValid(customer.getPhoneNumber())
                && isAdult(customer.getDob());
    }
}
