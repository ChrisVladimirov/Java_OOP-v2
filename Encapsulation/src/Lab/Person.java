package Lab;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", firstName, lastName, age);
    }
}
//FOR THE SALARY INCREASE EXERCISE #2:

//public class Person {
//    private final String firstName;
//    private final String lastName;
//    private final int age;
//    private double salary;
//
//    public Person(String firstName, String lastName, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
//
//    public Person(String firstName, String lastName, int age, double salary) {
//        this(firstName, lastName, age);
//        this.salary = salary;
//    }
//
//    public double getSalary() {
//        return salary;
//    }


//FOR THE PURPOSES OF EXERCISE THREE:

//public class Person {
//    private String firstName;
//    private String lastName;
//    private int age;
//    private double salary;
//
//    public Person(String firstName, String lastName, int age, double salary) {
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
//        this.setAge(age);
//        this.setSalary(salary);
//    }
//
//    public void setSalary(double salary) {
//        if (salary < 460) {
//            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
//        }
//        this.salary = salary;
//    }
//
//    public void setAge(int age) {
//        if (age <= 0) {
//            throw new IllegalArgumentException("Age cannot be zero or negative integer");
//        }
//        this.age = age;
//    }
//
//    public void setLastName(String lastName) {
//        if (lastName.length() < 3) {
//            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
//        }
//        this.lastName = lastName;
//    }
//
//    public void setFirstName(String firstName) {
//        if (firstName.length() < 3) {
//            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
//        }
//        this.firstName = firstName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s gets %f leva.", firstName, lastName, salary);
//    }
//
//    public void increaseSalary(double percentage) {
//        if (this.getAge() < 30) {
//            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 200));
//        } else {
//            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 100));
//        }
//    }
//}