package com.xt.impl;

import com.xt.api.IBlogApi;
import com.xt.dao.BlogMapper;
import com.xt.pojo.Blog;
import com.xt.utils.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogImpl implements IBlogApi {
    @Autowired
    private BlogMapper blogMapper;

    @Override
    public JsonObject getBlogs() {
        JsonObject jsonObject = new JsonObject();
        try {
            Blog blog = blogMapper.selectByPrimaryKey(1);
            jsonObject.setResult(blog);
        }catch (Exception e){
            jsonObject.setErrorCode("500");
            jsonObject.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return jsonObject;
    }
}
