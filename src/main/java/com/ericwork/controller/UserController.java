package com.ericwork.controller;

import com.alibaba.fastjson.JSON;
import com.ericwork.model.User;
import com.ericwork.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceInterface service;

    @RequestMapping(path = "/showUser",params = "id")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        User user = this.service.selectUser(userId);
        response.getWriter().write(JSON.toJSONString(user));
        response.getWriter().close();
    }


}
