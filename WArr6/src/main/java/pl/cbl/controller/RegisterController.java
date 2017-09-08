package pl.cbl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.cbl.dao.UserDao;
import pl.cbl.entity.User;
import pl.cbl.repository.UserRepository;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserRepository userRep;
	
	
	@GetMapping("")
	public String home(Model m) {
		
		m.addAttribute("user", new User());
		
		return "register";
	}
	
	@PostMapping("")
	public String home2(@Valid User user, BindingResult resoult) {
		if(resoult.hasErrors()) {
			return "register";
		}
		userDao.add(user);
		//userRep.save(user);    second add with repository
		return "redirect:/home";
	}
	
	
	
	
}
