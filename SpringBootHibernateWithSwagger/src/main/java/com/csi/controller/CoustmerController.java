package com.csi.controller;

import com.csi.model.Coustmer;
import com.csi.service.CoustmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CoustmerController {

    @Autowired
    CoustmerService coustmerService;


    @PostMapping("/savedata")

    public String Savedata(@RequestBody Coustmer coustmer){
        coustmerService.saveData(coustmer);
        return "save data sucessfully";
    }


    @GetMapping("/getdata")

    public List<Coustmer> getAllData(){
        return  coustmerService.getALLData();
    }
}
