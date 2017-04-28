package be.pxl.controller;

import be.pxl.model.Customer;
import be.pxl.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/hello")
    public String home(Model model) {
        Customer customer = customerService.findAll().get(0);

        model.addAttribute("customer", customer);

        return "hello";
    }

}
