package application.employee.model;


import org.springframework.data.mongodb.core.mapping.Document;
import platform.persistence.model.BaseModel;

/*
* Created by Alf_Wang on 2017-11-26.
*/
@Document(collection = "Employee")
public class Employee extends BaseModel {
    private String name;

    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
