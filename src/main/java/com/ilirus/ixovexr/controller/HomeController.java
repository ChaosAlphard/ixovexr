package com.ilirus.ixovexr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/")
public class HomeController {
    private Random ran = new Random();
    private String[] picPool = new String[]{
            "https://s1.ax1x.com/2018/12/05/Flc7UH.jpg",
            "https://s1.ax1x.com/2018/11/08/iHQ0L4.png",
            "https://s1.ax1x.com/2018/11/08/iHQDeJ.jpg"
    };
    private int picLen = picPool.length;

    @RequestMapping("home")
    public String homePage() {
        return "Hello World!";
    }

    @GetMapping("randpic")
    public String getRandPic() {
        int i = ran.nextInt(picLen);
        return picPool[i];
    }

}
