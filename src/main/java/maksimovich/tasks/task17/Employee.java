package maksimovich.tasks.task17;

public class Employee implements Comparable<Employee> {

    private double salary;

    @Override
    public int compareTo(Employee e) {
        return Double.compare(this.salary, e.salary);
    }

}
