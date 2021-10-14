package Pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MybaController {
	@RequestMapping("/login") 
	public String method08(Model model, Person person) {
			personDao dao = new personDao();
			dao.insert(person);
			model.addAttribute("pList",dao.showPerson());
		return "login";		
	}
}
