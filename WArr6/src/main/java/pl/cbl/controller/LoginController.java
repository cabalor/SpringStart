package pl.cbl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.cbl.entity.User;
import pl.cbl.model.LoginData;
import pl.cbl.repository.UserRepository;

@Controller
@RequestMapping("/login")
public class LoginController extends SessionedController{

	@Autowired
	UserRepository repoUser;

	@GetMapping("")
	public String login(Model m) {
		LoginData login = new LoginData();
		m.addAttribute("user", login);

		return "login";
	}

	@PostMapping("")
	public String loginPost(LoginData user, Model m) {
		User u = this.repoUser.findByEmail(user.getEmail());
		if (u == null) {
			m.addAttribute("msg", "Enter valid data");
			return "login";
		}

		if(u.isPasswordCorrect(user.getPassword())) {
			session().setAttribute("user", u);
		}
		return "redirect:/home";
	}

}