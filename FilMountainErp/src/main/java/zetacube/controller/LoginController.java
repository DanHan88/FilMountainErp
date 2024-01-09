package zetacube.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping(value={"/login"})
    public ModelAndView login(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("views/authentication/split/sign-in");
        return mav;
    }
	
	
}
