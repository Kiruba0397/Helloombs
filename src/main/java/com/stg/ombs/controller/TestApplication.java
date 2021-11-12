package com.stg.ombs.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestApplication {
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('ADMIN') or hasRole('VISITOR') or hasRole('MEMBER') or hasRole('MAID')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/visit1")
    @PreAuthorize("hasRole('VISITOR')")
    public String visitor() {
        return "Moderator Board.";
    }
    @GetMapping("/visit")
    @PreAuthorize("hasRole('VISITOR')")
    public String visitorAccess() {
        return "Moderator Board.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }
    @GetMapping("/member")
    @PreAuthorize("hasRole('MEMBER')")
    public String memberAccess() {
        return "Admin Board.";
    }
    @GetMapping("/maid")
    @PreAuthorize("hasRole('MAID')")
    public String maidAccess() {
        return "Admin Board.";
    }
}
