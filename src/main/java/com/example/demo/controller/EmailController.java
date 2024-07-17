package com.example.demo.controller;

import com.example.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1")
public class EmailController {

    @Autowired
    public EmailService emailService;

    @PostMapping(value = "/send-emails", consumes = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<?> sendEmails(
            @RequestPart("file") MultipartFile file
    ) {
        String[] recipients = {"sunday.odong@coseke.com", "lanyerotracy96@gmail.com"};

        return new ResponseEntity<>(emailService.sendEmails(
                recipients,
                "Notification",
                "Pride Notification",
                file
        ), HttpStatus.OK);
    }
}
