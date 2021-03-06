package haagahelia.course.hellothymeleaf.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello")
	public String hello(@RequestParam(name="name", required = false, defaultValue="Vinny") String name,
			@RequestParam(name="age", required = false, defaultValue="30") int age, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}
	
	@RequestMapping(value="/studentlist", method=RequestMethod.GET)
	public String helloStudents(Model model) {
		ArrayList<Student> studentlist = new ArrayList<Student>();
		
		Student student1 = new Student("John", "Lenon", "john.lennon@gmail.com");
		studentlist.add(student1);
		
		Student student2 = new Student("Barack", "Obama", "barack.Obama@gmail.com");
		studentlist.add(student2);

		Student student3 = new Student("Donald", "Trump", "donal.trump@gmail.com");
		studentlist.add(student3);

		studentlist.add(new Student("Vu", "Nguyen", "vu.nguyen@gmail.com"));
		
		model.addAttribute("studentlist",studentlist);
		return "studentList";
	}
	

}
