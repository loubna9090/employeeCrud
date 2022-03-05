package net.javaguides.springBoot;

import net.javaguides.springBoot.model.Employee;
import net.javaguides.springBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManageBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ManageBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("loubna");
//		employee.setLastName("Damri");
//		employee.setJob("Developer");
//		employee.setEmail("loubnadamri@gmail.com");
//		employeeRepository.save(employee);

//		Employee employee1 = new Employee();
//		employee1.setFirstName("abdallah");
//		employee1.setLastName("Damri");
//		employee1.setJob("Developer full stack");
//		employee1.setEmail("abdallahdamri@gmail.com");
//		employeeRepository.save(employee1);

	}
}
