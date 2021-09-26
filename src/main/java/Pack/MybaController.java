package Pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MybaController {
	@RequestMapping("/login") //앞으로 t1으로 부르면 되게면 함수 호출을 method01을 하겠다.
	public String method08(Model model, Person person) {
			personDao dao = new personDao();
			dao.insert(person);
			model.addAttribute("pList",dao.showPerson());
		return "login";		
	}
}
