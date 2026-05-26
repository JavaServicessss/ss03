package com.bt04.controller;

import com.bt04.model.SinhVien;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SinhVienController {

    @GetMapping(
            value="/sinhvien",
            produces={
                    "application/json",
                    "application/xml"
            }
    )

    public List<SinhVien> getSinhVien() {

        return Arrays.asList(

                new SinhVien(
                        "SV001",
                        "Nguyen Van A",
                        8.5
                ),

                new SinhVien(
                        "SV002",
                        "Tran Thi B",
                        7.8
                ),

                new SinhVien(
                        "SV003",
                        "Le Van C",
                        9.2
                )
        );
    }
}
