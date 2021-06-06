package com.evan.wj.controller;


import com.evan.wj.pojo.User;
import com.evan.wj.result.Result;
import com.evan.wj.result.ResultFactory;
import com.evan.wj.service.AdminMenuService;
import com.evan.wj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: xinyang shen
 * \* Date: 2021/5/30
 * \* Time: 13:39
 * \* Description:
 * \
 */
@Controller
public class UserInfoController {
    @Autowired
    AdminMenuService adminMenuService;

    @GetMapping("/api/userInfo/findName")
    @ResponseBody
    public Result menu() {
        return ResultFactory.buildSuccessResult(adminMenuService.findName());
    }

    @PutMapping("/api/userInfo/changePasswordSubmit/{password}")
    @ResponseBody
    public Result changePassword(@PathVariable("password") String password) {
        adminMenuService.changePassword(password);
        System.out.println("修改密码");
        return ResultFactory.buildSuccessResult("修改密码成功");
    }

    @GetMapping("/api/userInfo/PersonalInfo")
    @ResponseBody
    public Result personalInfo() {
        return ResultFactory.buildSuccessResult(adminMenuService.personalInfo());
    }

    @PutMapping("/api/userInfo/changeInfo")
    @ResponseBody
    public Result editUser(@RequestBody @Valid User requestUser) {
        adminMenuService.editUser(requestUser);
        return ResultFactory.buildSuccessResult("修改用户信息成功");
    }

}
