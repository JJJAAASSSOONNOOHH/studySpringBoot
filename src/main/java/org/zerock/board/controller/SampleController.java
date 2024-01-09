package org.zerock.board.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/sample/")
public class SampleController {
    @GetMapping("/exall")
    public void exAll() {
        log.info("exAll()!!!!!!");
    }

    @GetMapping("/exmember")
    public void exMember() {
        log.info("exMember()!!!!!!");
    }

    @GetMapping("/exadmin")
    public void exAdmin() {
        log.info("exAdmin()!!!!!!");
    }
}
