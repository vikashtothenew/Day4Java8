package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ques4 {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(even -> even % 2 == 0)
                .forEach(System.out::println);

        Employee[] employees = {
                new Employee("Vikash", "Kumar", "Rai", 5500, "Banaras"),
                new Employee("Srijan", "Singh", "Pandey", 2300, "Delhi"),
                new Employee("Rahul", "Kumar", "Yadav", 5700, "Delhi"),
                new Employee("Shivam", "Kumar", "Yadav", 2300, "GZP"),
                new Employee("Prakash", "Singh", "Bisht", 4300, "Delhi"),

        };
        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);
        System.out.printf("%nUnique employee last names:%n");

        list.stream()
                .filter(employee -> employee.getSalary()<5000 && employee.getCity().equals("Delhi"))
                .map(Employee::getFirstName)
                .distinct()
                .forEach(System.out::println);



    }
}
class Employee
{
    private String firstName;

    private String middleName;
    private String lastName;
    private double salary;
    private String city;

    // constructor
    public Employee(String firstName,String middleName, String lastName,
                    double salary, String city)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.city = city;
    }

    // set firstName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // get firstName
    public String getFirstName()
    {
        return firstName;
    }

    public void setMiddleNameName(String middleName)
    {
        this.middleName = middleName;
    }

    // get firstName
    public String getMiddleName()
    {
        return middleName;
    }

    // set lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // get lastName
    public String getLastName()
    {
        return lastName;
    }

    // set salary
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    // get salary
    public double getSalary()
    {
        return salary;
    }

    // set department
    public void setCity(String city)
    {
        this.city = city;
    }

    // get department
    public String getCity()
    {
        return city;
    }

    // return Employee's first and last name combined
    public String getName()
    {
        return String.format("%s %s %s", getFirstName(),getMiddleName(), getLastName());
    }

    // return a String containing the Employee's information
    @Override
    public String toString()
    {
        return String.format("%-8s %-8s %8.2f   %s",
                getFirstName(), getLastName(), getSalary(), getCity());
    }
}
