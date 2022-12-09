package com.example.demo.dao;

import com.example.demo.pojo.Emp;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmpDap {
    private static Map<Integer, Emp> emps = null;

    static {
       emps = new HashMap<>();
    }

    public void saveEmp(int id,Emp emp) {
        if(!emps.containsKey(id)){
            emps.put(id, emp);
        }
    }

    public void updateEmp(int id,Emp emp) {
        emps.put(id, emp);
    }

}
