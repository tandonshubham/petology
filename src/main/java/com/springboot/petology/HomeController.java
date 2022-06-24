package com.springboot.petology;

import com.springboot.petology.model.Inquiry;
import com.springboot.petology.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private HomeService homeService;
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }

    @GetMapping("/shop")
    public String product(Model model){
        model.addAttribute("product",homeService.getObjects());
        return "shop";
    }

    @PostMapping("/shop")
    public String searchProduct(Model model, @ModelAttribute Inquiry inquiry){
        String productName = inquiry.getSearchString();
        model.addAttribute("product",homeService.searchObject(productName));
        return "shop";
    }
}
