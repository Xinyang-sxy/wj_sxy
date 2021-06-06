package com.evan.wj.controller;


import com.evan.wj.dto.UserDTO;
import com.evan.wj.pojo.AdminMenu;
import com.evan.wj.pojo.User;
import com.evan.wj.result.Result;
import com.evan.wj.result.ResultFactory;
import com.evan.wj.service.AdminMenuService;
import com.evan.wj.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * \* Created with IntelliJ IDEA.
 * \* User: xinyang shen
 * \* Date: 2021/5/20
 * \* Time: 13:18
 * \* Description:
 * \
 */
@Controller
public class MenuController {
    @Autowired
    AdminMenuService adminMenuService;

    @GetMapping("/api/menu")
    @ResponseBody
    public Result menu() {
       return ResultFactory.buildSuccessResult(adminMenuService.getMenusByCurrentUser());
    }

    @GetMapping("/api/admin/role/menu")
    @ResponseBody
    public Result listAllMenus() {
        return ResultFactory.buildSuccessResult(adminMenuService.getMenusByRoleId(1));
    }

}
