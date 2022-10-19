package com.nestdigital.reciepebackend.Controller;

import com.nestdigital.reciepebackend.Dao.ReciepeDao;
import com.nestdigital.reciepebackend.Model.ReciepeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ReciepeControl {
    @Autowired
    private ReciepeDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addreciepe",consumes = "application/json",produces = "application/json")
    public String addreciepe(@RequestBody ReciepeModel receipe){
        System.out.println(receipe.toString());
        dao.save(receipe);
        return "{{status:'success'}}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewreciepe")
    public List<ReciepeModel>viewreciepe(){
        return (List<ReciepeModel>) dao.findAll();
    }
}
