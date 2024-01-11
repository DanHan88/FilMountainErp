package zetacube.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
public class LoginController {

	@GetMapping(value={"/"})
    public ModelAndView login(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("views/authentication/split/sign-in");
        return mav;
    }
    @GetMapping(value={"/index"})
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("views/index");
        return mav;
    }
    @GetMapping(value={"/notifications"})
    public ModelAndView notifications(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("views/notifications");
        return mav;
    }
	
}
