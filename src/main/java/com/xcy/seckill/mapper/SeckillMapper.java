package com.xcy.seckill.mapper;

import com.xcy.seckill.pojo.Seckill;

import java.util.List;

public interface SeckillMapper {
    List<Seckill> getSeckillList();
    Seckill getSeckillById(int id);
}
