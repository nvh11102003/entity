package com.example.thi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "hangkhachhang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HangKhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahang")
    private Integer maHang;

    @Column(name = "tenhang")
    private String tenHang;

    @Column(name = "mota")
    private String moTa;

    @Column(name = "diemtoithieu")
    private int diemToiThieu;

    @Column(name = "trangthai")
    private int trangThai;

    @OneToMany(mappedBy = "hangKhachHang")
    private List<KhachHang> khachHangList;

}
