package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕하세요. 환영합니다";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    } // 클라이언트에서 요청 시 새로운 URL로 전송

}
