package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //display all employees with email address"@gmail"

    List<Employee> findByEmail(String something);

    //display all employees with first name "" and last name""
    //also show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //display all employees that first name is not ""
    List<Employee> findByFirstNameIsNot(String firstname);

//   //display all employees where last name starts with ""
//    List<Employee> findByLastNameStarsWith(String lastnamestarts);

    //display all employees with salaries higher than
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //display all employees with salaries less than
    List<Employee> findBySalaryLessThan(Integer salary);

    //Display all employees that has been hired between "" and ""
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //Display all employees where salaries greater and equal to "" in order-salary
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    //Display top unique 3 employees that is making less than ""
    List<Employee> findTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    ////using jpa queries
    @Query("SELECT employee FROM Employee employee WHERE employee.email='amcnee1@google.es'")
    Employee retrieveEmployeeDetail();


    @Query("SELECT e.salary FROM Employee e WHERE e.email='amcnee1@google.es'")
    Integer retrieveEmployeeSalary();

//    //not equal
//    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);

    @Query("SELECT e from Employee e where e.salary <> ?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(int salary);

//like /contians /startwith/ endswith/
    @Query("SELECT  e from Employee  e where e.firstName like ?1")
    List<Employee> retrieveEmployeeFirstNameLike(String pattern);

    //lees than
    @Query("SELECT  e from Employee  e where e.salary < ?1")
    List<Employee> retrieveEmployeeSalaryLessThan(int salary);

    //greater than
    @Query("SELECT  e from Employee  e where e.salary > ?1")
    List<Employee> retrieveEmployeeSalaryGreaterThan(int salary);

    //between
    @Query("SELECT  e from Employee  e where  e.salary between ?1 and ?2")
    List<Employee>retrieveEmployeeSalaryBetween(int salary1, int salary2);

    //before
    @Query("select e from Employee  e where e.hireDate > ?1")
    List<Employee> retrieveEmployeeHireDateBefore(LocalDate date);


}
