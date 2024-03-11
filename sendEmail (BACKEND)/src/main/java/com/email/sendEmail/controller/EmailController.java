package com.email.sendEmail.controller;

import com.email.sendEmail.DTO.Email;
import com.email.sendEmail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("email")
@RestController
@CrossOrigin("*")
public class EmailController {
    @Autowired
    private EmailService service;

    @PostMapping
  public void Send(@RequestBody Email email){
      service.EmailSend(email);
  }
}
