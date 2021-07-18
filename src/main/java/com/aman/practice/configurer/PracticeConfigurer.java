package com.aman.practice.configurer;

import com.aman.practice.repository.EmployeeRepository;
import com.aman.practice.repository.EmployeeJPARepository;
import com.aman.practice.repository.IEmpRepository;
import com.aman.practice.service.EmployeeService;
import com.aman.practice.service.IEmpService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeConfigurer {

    /*@RepositoryType("Employee")
    @Bean
    public IEmpRepository empRepository(){
        return new EmployeeRepository();
    }

    @RepositoryType("EmployeeWork")
    @Bean
    public IEmpRepository empWorkRepository(){
        return new EmployeeWorkRepository();
    }

    @Bean(name="empService")
    public IEmpService empService(){
        return new EmployeeService();
    }*/

}
