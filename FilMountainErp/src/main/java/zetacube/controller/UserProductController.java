package zetacube.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user/product")
public class UserProductController {
	@GetMapping(value={"/"})
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("views/user/product");
        return mav;
    }

}
