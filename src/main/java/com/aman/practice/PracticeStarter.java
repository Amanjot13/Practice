package com.aman.practice;


import com.aman.practice.service.IEmpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableMBeanExport;

@EnableAutoConfiguration
@EnableConfigurationProperties
@EnableMBeanExport
@SpringBootApplication
@ComponentScan(value = {"com.aman.practice"})
public class PracticeStarter {

    public static void main(String[] args) {
        ApplicationContext ac= SpringApplication.run(PracticeStarter.class, args);
        IEmpService es = ac.getBean("employeeJPAService", IEmpService.class);
        es.getEmployeeDetails();
    }

}
