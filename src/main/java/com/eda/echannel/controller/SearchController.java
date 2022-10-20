package com.eda.echannel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/search")
public class SearchController {

    @Autowired
    public SearchController() {

    }

    @GetMapping(value = "/")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("Testing", HttpStatus.OK);
    }
}
