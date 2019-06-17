package com.itheima.service.impl;

import com.itheima.dao.itemsmapper;
import com.itheima.domain.items;
import com.itheima.service.itemsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class itemsserviceimpl implements itemsservice
 {
     @Autowired
     private itemsmapper itemsdao;
     public items select(int id) {
         items items = itemsdao.select(id);
         return items;
     }
 }
