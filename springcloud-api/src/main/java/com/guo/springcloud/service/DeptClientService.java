package com.guo.springcloud.service;

import com.guo.springcloud.pojo.Dept;

import java.util.List;

public interface DeptClientService {

        public boolean addDept(Dept dept);

        public Dept queryById(int id);

        public List<Dept> queyAll();

}
