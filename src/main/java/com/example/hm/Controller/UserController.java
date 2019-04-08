package com.example.hm.Controller;

import com.example.hm.request.UserReq;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping("/user")
public class UserController {
    //用户中心
    //登录
    @GetMapping("/login")
    public boolean Login(String account, String password, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        if (!"123456".equals(password)) {
            map.put("success", false);
            map.put("message", "密码错误");
            return false;
        }


        return true;
    }

    @RequestMapping("/post")
    public String PostLogin(@RequestBody UserReq req){

        String acc = req.getAccount();

        return req.getAccount()+" : "+req.getPassword();
    }
}
