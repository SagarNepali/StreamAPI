package optional;

import java.util.Optional;

public class _Optional {

    static class Person {
        private String name;
        private String email;

        public Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Person() {
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Person p = new Person("Hari",null);
        Person per = new Person("Hari","ad@am.com");
        Person person = new Person();

        System.out.println(Optional.ofNullable(null)
                .orElse(per)
                .toString());
    }
}
