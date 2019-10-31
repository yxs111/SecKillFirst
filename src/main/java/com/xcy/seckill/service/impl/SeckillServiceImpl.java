package com.xcy.seckill.service.impl;

import com.xcy.seckill.mapper.SeckillMapper;
import com.xcy.seckill.pojo.Seckill;
import com.xcy.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeckillServiceImpl implements SeckillService {

    @Autowired
    SeckillMapper seckillMapper;

    @Override
    public List<Seckill> getSeckillList() {
        return seckillMapper.getSeckillList();
    }

    @Override
    public Seckill getSeckillById(int id) {
        return seckillMapper.getSeckillById(id);
    }
}
