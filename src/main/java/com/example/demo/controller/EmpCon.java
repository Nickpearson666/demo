package com.example.demo.controller;

import com.example.demo.dao.EmpDap;
import com.example.demo.pojo.Emp;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class EmpCon {

    @Autowired
    EmpDap empDap;


    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/emp")
    @ResponseBody
    public String saveEmp(@RequestBody String param) throws JSONException {
      /*  const param = {
                fName: contact.fName,
                email: contact.email,
                lName: contact.lName;
        imageUrl: contact.imageUrl;
        phone: contact.phone;
    }*/
        JSONObject jo = new JSONObject(param);
        Emp currEmp = new Emp();
        int id = (int)jo.get("id");
        currEmp.setEmail((String) jo.get("email"));
        currEmp.setImage((String) jo.get("imageUrl"));
        currEmp.setFistName((String) jo.get("fName"));
        currEmp.setLastName((String) jo.get("lName"));
        currEmp.setPhone((String) jo.get("phone"));
        empDap.saveEmp(id, currEmp);
        //return
        JSONObject result = new JSONObject();
        try {
            result.put("msg", "ok");
            result.put("method", "json");
            result.put("data", jo.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println("res:"+result.toString());
        return result.toString();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/update")
    @ResponseBody
    public String updateEmp(@RequestBody String param) throws JSONException {
      /*  const param = {
                fName: contact.fName,
                email: contact.email,
                lName: contact.lName;
        imageUrl: contact.imageUrl;
        phone: contact.phone;
    }*/
        JSONObject jo = new JSONObject(param);
        Emp currEmp = new Emp();
        int id = (int)jo.get("id");
        currEmp.setEmail((String) jo.get("email"));
        currEmp.setImage((String) jo.get("imageUrl"));
        currEmp.setFistName((String) jo.get("fName"));
        currEmp.setLastName((String) jo.get("lName"));
        currEmp.setPhone((String) jo.get("phone"));
        empDap.updateEmp(id, currEmp);
        //return
        JSONObject result = new JSONObject();
        try {
            result.put("msg", "ok");
            result.put("method", "json");
            result.put("data", jo.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println("res:"+result.toString());
        return result.toString();
    }
}
