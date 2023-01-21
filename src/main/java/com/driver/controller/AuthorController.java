package com.driver.controller;

import com.driver.Dto.AuthorDto;
import com.driver.models.Author;
import com.driver.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
//Add required annotations
public class AuthorController {

    //Write createAuthor API with required annotations
    @Autowired
    AuthorService authorService;

    @PostMapping("/createAuthor")
    public ResponseEntity createAuthor(@RequestBody Author author){

        authorService.create(author);
        return  new ResponseEntity("Success",HttpStatus.OK);
    }

}
