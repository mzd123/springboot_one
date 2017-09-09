package com.controller;

import com.bean.MyResult;
import com.service.UserService;
import com.utils.GetMyResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/27.
 */
@RestController
public class Acontroller {
    private final static String URL = "/api/Acontroller/";

    private final UserService userService;
    //Integer类型的ThreadLocal变量
    private ThreadLocal<Integer> a = new ThreadLocal<Integer>();

    @Autowired
    public Acontroller(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = URL + "doTest", method = RequestMethod.GET)
    @ApiOperation("用户登入")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "aid", value = "用户id", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "aname", value = "用户名字", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "asex", value = "用户性别", required = true, dataType = "String", paramType = "query")
    })
    public MyResult doTest(@RequestParam("aid") String aid, @RequestParam("aname") String aname, @RequestParam("asex") String asex) {
        if (aid.isEmpty() || aname.isEmpty() || asex.isEmpty()) {
            return GetMyResult.getResult(false, null, null, "不能为空");
        }
        return userService.selectAllMessage(aid, aname, asex);
    }
}
