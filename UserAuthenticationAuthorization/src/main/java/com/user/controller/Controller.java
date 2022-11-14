package com.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
 @GetMapping("/authenticated")
 public String authenticatedUser() {
	 return "Welcome";
 }
 @GetMapping("/public")
 public String publicPage() {
	 return "Welcome";
 }
}
