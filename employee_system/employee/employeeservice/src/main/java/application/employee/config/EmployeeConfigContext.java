package application.employee.config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import platform.persistence.mongo.MongoConfigContext;

/*
* Created by Alf_Wang on 2017-11-26.
*/
@Configuration
@EnableMongoRepositories({"application.employee.model"})
@ComponentScan({"application.employee"})
@Import(MongoConfigContext.class)
@PropertySource("classpath:employee_db.properties")
public class EmployeeConfigContext {


    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setLocalOverride(true);
        return propertySourcesPlaceholderConfigurer;
    }

}
