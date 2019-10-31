package com.xcy.seckill.controller;

import com.xcy.seckill.pojo.Seckill;
import com.xcy.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SecKillController {


    @Autowired
    SeckillService seckillService;

    @RequestMapping( value="/seckillList",method = RequestMethod.GET)
    public List<Seckill> getSeckillList(){
      return  seckillService.getSeckillList();
    }

    @RequestMapping("/getSeckillById")
    public Seckill getSeckillById(int id){
        return  seckillService.getSeckillById(id);
    }

    @RequestMapping("/getNowTime")
    public Long getNowTime(){
        Date date =new Date();
        return date.getTime();
    }
}
