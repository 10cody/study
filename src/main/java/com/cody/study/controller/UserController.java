package com.cody.study.controller;

import com.cody.study.entity.dto.UserDto;
import com.cody.study.entity.vo.UserVo;
import org.springframework.web.bind.annotation.*;

/**
 * @author cody
 * @date 2020/6/21
 */
@RequestMapping("/api/user/")
@RestController
public class UserController {

    /**
     * 用户列表
     * @param userDto userDto
     */
    @RequestMapping(path = "list", method = {RequestMethod.GET,  RequestMethod.POST}  )
    public UserVo list(UserDto userDto){
        return null;
    }

    /**
     * 保存用户
     * @param userDto userDto
     */
    @PostMapping(path = "save")
    public UserVo saveUser(@RequestBody UserDto userDto){
        return null;
    }
}
