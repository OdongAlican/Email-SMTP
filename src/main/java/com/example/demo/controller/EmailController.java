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

    @PostMapping(value = "/send-emails", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> sendEmails(@RequestParam("files") MultipartFile[] files) {
        String result = emailService.sendEmails(files);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(value = "/branch-reports", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> sendReports(@RequestParam("files") MultipartFile[] files){
        String result = emailService.sendReports(files);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}



