package com.gy.jcartadministration.controller;

import com.gy.jcartadministration.dto.in.AdminLoginDTO;
import com.gy.jcartadministration.dto.in.AdminUpdateProfileDTO;
import com.gy.jcartadministration.dto.out.AdminGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interview")
public class AdminController {

    @GetMapping("/UserList")
    public String userList(@RequestParam String userName,@RequestParam String real_name, @RequestParam String email){
            return null;
    }

    @GetMapping("/login")
    public String login(AdminLoginDTO adminLoginDTO){
        return null;
    }

    @GetMapping("/getProfile")
    public AdminGetProfileOutDTO getProfile(Integer administrator_id){
        return null;
    }

    @PostMapping("/updateProdfile")
    public void updatePro(@RequestBody AdminUpdateProfileDTO adminUpdateProfileDTO){

    }

}
