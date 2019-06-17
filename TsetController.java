package com.lzp.annotation;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyong
 *
 * @Date: 2019/6/16.
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TsetController {

    @RequestMapping(value = "test",method = RequestMethod.POST)
    @WebLog(description = "接口开始")
    public void test(@RequestBody User user) {
        System.out.println(user.getName() + "start");
    }
}
