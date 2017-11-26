package apllication.employee.api;

import application.employee.model.Employee;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.WebEndpoint;
import java.util.Collection;

/*
* Created by Alf_Wang on 2017-11-26.
*/
@Path("/employee")
public interface EmployeeServiceInterface {

    @Path("/employees")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @GET
    public Collection<Employee> getEmployees();

    public void addEmployee(Employee employee);
}
