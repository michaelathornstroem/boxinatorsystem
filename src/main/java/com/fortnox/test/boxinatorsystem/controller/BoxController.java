package com.fortnox.test.boxinatorsystem.controller;

import com.fortnox.test.boxinatorsystem.model.Box;
import com.fortnox.test.boxinatorsystem.service.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class BoxController {
    @Autowired
    private BoxService boxService;

    @PostMapping(value = "addbox", consumes = {"application/xml","application/json"})
    public String add(@RequestBody Box box){
        boxService.saveBox(box);
        return "forward:/index.html";
    }

    @GetMapping("listboxes")
    public List<Box> getAllBoxes(){
        return boxService.getAllBoxes();
    }
}
