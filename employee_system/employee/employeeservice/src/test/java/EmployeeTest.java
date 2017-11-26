import application.employee.config.EmployeeConfigContext;
import application.employee.model.Employee;
import application.employee.model.EmployeeRepository;
import application.employee.service.EmployeeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

/*
* Created by Alf_Wang on 2017-11-26.
*/
public class EmployeeTest {
    private static EmployeeService employeeService;

    //@Before
    public void init() {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfigContext.class);


        employeeService = context.getBean(EmployeeService.class);
    }

    //@Test
    public void testFindAll() {
        Collection<Employee> employeeList = employeeService.getEmployees();
        if (employeeList != null && employeeList.size() > 0) {
            System.out.println("\n=================start======================\n");
            for (Employee item : employeeList) {
                System.out.println("\n=================\nId:" + item.getId() + "|Name:" + item.getName() + "|Code:" + item.getCode() + "\n======================\n");
            }
            System.out.println("\n=================end======================\n");
        }

    }

    //@Test
    public void insertData() {
        Employee employee = new Employee();
        employee.setName("Jacky");
        employee.setCode("E01");
        employeeService.addEmployee(employee);
    }
}
