package com.qf.repeat.mapper;


import com.qf.repeat.entity.Human;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanDao {
    int insert(@Param("human") Human human);
}
