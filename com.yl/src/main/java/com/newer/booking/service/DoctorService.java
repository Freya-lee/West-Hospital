package com.newer.booking.service;

import com.newer.booking.pojo.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> findDoctor();

    List<Doctor> findDoctorByDep(int department);
}
