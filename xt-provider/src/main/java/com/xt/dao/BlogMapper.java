package com.xt.dao;

import com.xt.pojo.Blog;

public interface BlogMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);
}




