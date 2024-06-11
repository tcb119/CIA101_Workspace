package idv.david.stream.additional;

import java.time.LocalDate;
import java.util.List;

import idv.david.stream.Employee;
import idv.david.stream.Gender;
import idv.david.stream.Role;

public class Test02ReplaceAll {

	public static void main(String[] args) {
		List<Employee> empList = Employee.createShortList();

		System.out.println("=== Starting List ===");
		empList.forEach(Employee::printSummary);

		empList.replaceAll(e -> 
        new Employee.Builder()
        		.givenName("Bob")
        		.surName("Baker")
        		.age(23)
        		.gender(Gender.MALE)
        		.role(Role.STAFF)
        		.dept("Eng")
        		.startDate(LocalDate.of(2013, 1, 10))
        		.salary(40000)
        		.email("bob.baker@example.com")
        		.phoneNumber("201-121-4678")
        		.address("44 4th St")
        		.city("Smallville")
        		.state("KS")
        		.code("12333")
        		.build() 
			);

		System.out.println("=== Ending List ===");
		empList.forEach(Employee::printSummary);
	}

}
