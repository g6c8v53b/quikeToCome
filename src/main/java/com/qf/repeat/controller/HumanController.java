package com.qf.repeat.controller;

import com.qf.repeat.service.HumanService;
import com.qf.repeat.service.serviceImpl.HumanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/human")
public class
HumanController {

    @Autowired
    private HumanServiceImpl humanServiceImpl;

    @PostMapping("/insert")
    public int insert(@RequestParam int age, @RequestParam String born, @RequestParam int idcard, @RequestParam String name){
        /*Human human=new Human();
        human.setAge(age);
        human.setBorn(born);
        human.setName(name);
        human.setIdCard(idcard);
        return humanService.insert(human);*/
        return 1;

    }
}
