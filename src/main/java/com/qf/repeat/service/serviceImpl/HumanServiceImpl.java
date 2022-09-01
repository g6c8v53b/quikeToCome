package com.qf.repeat.service.serviceImpl;


import com.qf.repeat.entity.Human;
import com.qf.repeat.mapper.HumanDao;
import com.qf.repeat.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HumanServiceImpl implements HumanService {

    @Autowired
    private HumanDao humanDao;
    @Override
    public int insert(Human human) {
        return humanDao.insert(human);
    }
}
