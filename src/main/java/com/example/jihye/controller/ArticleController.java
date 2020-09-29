package com.example.jihye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles")
    public String index(Model model) {
        model.addAttribute("msg", "안녕하세요, 반갑습니다!");
        return "articles/index"; // 뷰페이지 설정
    }

    @GetMapping("/articles/new") // GET 요청이 해당 url로 오면, 아래 메소드를 수행!
    public String newArticle() {
        return "articles/new"; // 보여줄 뷰 페이지
    }

}
