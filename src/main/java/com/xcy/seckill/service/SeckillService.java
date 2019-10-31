package com.xcy.seckill.service;

import com.xcy.seckill.pojo.Seckill;

import java.util.List;

public interface SeckillService {
    List<Seckill> getSeckillList();

    Seckill getSeckillById(int id);
}
