package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    /*  const param = {
                fName: contact.fName,
                email: contact.email,
                lName: contact.lName;
        imageUrl: contact.imageUrl;
        phone: contact.phone;
    }*/
    String fistName;
    String email;
    String lastName;
    String phone;
    String image;
}
