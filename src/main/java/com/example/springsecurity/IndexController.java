package com.example.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping({"","/"})
    public String index() {
        return "index";
    }

    @GetMapping("/user")
    @ResponseBody
    public String user(){
        return "user";
    }

    @GetMapping("/manager")
    @ResponseBody
    public String manager(){
        return "manager";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "admin";
    }

    // 시큐리티 로그인 페이지로 안가고 여기로 오도록 강제함.
    @GetMapping("/login")
    @ResponseBody
    public String login(){
        return "login";
    }

    @GetMapping("/join")
    @ResponseBody
    public String join(){
        return "join";
    }

    @GetMapping("/joinProc")
    @ResponseBody
    public String joinProc(){
        return "회원가입이 완료됨";
    }

}
