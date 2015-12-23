package com.arcturusx.eatery;

import com.arcturusx.eatery.service.BusinessService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bruntha on 12/17/15.
 */
public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
        BusinessService service = ctx.getBean("employeeService", BusinessService.class);

//        service.insert(new BusinessEntity("Ass","sss","sss","sss","sss",0.21f,10));

        ctx.close();
    }
}
