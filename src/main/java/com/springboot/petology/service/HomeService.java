package com.springboot.petology.service;

import com.springboot.petology.model.Objects;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {
    public List<Objects> getObjects(){
        List<Objects> objects = new ArrayList<>();
        Objects iceCream1= new Objects(1,"https://images.lululemon.com/is/image/lululemon/LM3DEHS_049872_1?wid=1280&op_usm=0.5,2,10,0&fmt=webp&qlt=80,1&fit=constrain,0&op_sharpen=0&resMode=sharp2&iccEmbed=0&printRes=72",
                "White T-Shirt", 45);

        Objects iceCream2= new Objects(2,"https://images.lululemon.com/is/image/lululemon/LM3DF0S_050593_1?wid=1125&op_usm=0.5,2,10,0&fmt=webp&qlt=80,1&fit=constrain,0&op_sharpen=0&resMode=sharp2&iccEmbed=0&printRes=72",
                "Red Shirt",50
     );
        Objects iceCream3= new Objects(3,"https://images.lululemon.com/is/image/lululemon/LM5A90S_033928_1?wid=1125&op_usm=0.5,2,10,0&fmt=webp&qlt=80,1&fit=constrain,0&op_sharpen=0&resMode=sharp2&iccEmbed=0&printRes=72",
                "Jeans",99
        );
        objects.add(iceCream1);
        objects.add(iceCream2);
        objects.add(iceCream3);
        return objects;

    }

    public List<Objects> searchObject(String objectName){
        List<Objects> objects = new ArrayList<>();
        Objects iceCream1= new Objects(1,"https://images.lululemon.com/is/image/lululemon/LM3DEHS_049872_1?wid=1280&op_usm=0.5,2,10,0&fmt=webp&qlt=80,1&fit=constrain,0&op_sharpen=0&resMode=sharp2&iccEmbed=0&printRes=72",
                objectName, 45);

        objects.add(iceCream1);

        return objects;

    }
}