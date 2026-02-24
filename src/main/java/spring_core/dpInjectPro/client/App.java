package spring_core.dpInjectPro.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_core.dpInjectPro.Entity.Employee;
import spring_core.dpInjectPro.repo.EmployeeDao;



public class App {
	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application.xml");
		EmployeeDao edao = ioc.getBean("edao", EmployeeDao.class);
		Employee emp1 = new Employee(1, "Mukul Sharma","Male", 888000);
		edao.saveEmployee(emp1);


	}
}
