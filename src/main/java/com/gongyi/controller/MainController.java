package com.gongyi.controller;

import com.gongyi.model.TestTableEntity;
import com.gongyi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }

    @RequestMapping(value = "/showList", method = RequestMethod.GET)
    public String showList(ModelMap modelMap)
    {
        List<TestTableEntity> testList = userRepository.findAll();
        modelMap.addAttribute("userList",testList);
        return "admin/users";
    }
}
