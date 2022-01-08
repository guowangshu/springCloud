package com.guo.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private int id;
    private String dname;
    private String dbSource;

    public Dept(String dname){
        this.dname=dname;
    }

}
