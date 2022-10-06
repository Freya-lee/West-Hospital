package com.newer.booking.service;

import com.newer.booking.pojo.Clinic;

import java.util.List;

public interface ClinicService {
    //查询所有科室
    List<Clinic> findAllClinic();

}
