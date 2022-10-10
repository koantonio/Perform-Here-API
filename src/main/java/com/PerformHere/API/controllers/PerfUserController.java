package com.PerformHere.API.controllers;

import com.PerformHere.API.services.PerfUserService;
import com.PerformHere.API.entities.PerfUser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("perfUsers")
public class PerfUserController {

   public PerfUserService perfUserService;

   public PerfUserController(PerfUserService perfUserService) {
       this.perfUserService = perfUserService;
   }

   @GetMapping("getAll")
   public List<PerfUser> getAllUsers() {
       return this.perfUserService.getAllUsers();
   }

   @PostMapping("add")
    public PerfUser addUser(@RequestBody PerfUser perfUser) {
       return this.perfUserService.saveUser(perfUser);
   }
}
