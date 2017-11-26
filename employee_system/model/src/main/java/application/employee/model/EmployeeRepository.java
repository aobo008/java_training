package application.employee.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
* Created by Alf_Wang on 2017-11-26.
*/
@Repository
public interface EmployeeRepository extends MongoRepository<Employee ,String> {

}
