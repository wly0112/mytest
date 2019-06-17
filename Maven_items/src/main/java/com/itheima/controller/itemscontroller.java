package com.itheima.controller;

import com.itheima.domain.items;
import com.itheima.service.itemsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class itemscontroller {
    @Autowired
    @Qualifier("service")
 private itemsservice itemsservice;

 @RequestMapping("/show")
 public  String  show(int id , Model model){
     items select = itemsservice.select(id);
     model.addAttribute("items",select);
     return "itemDetail";


 }


}
