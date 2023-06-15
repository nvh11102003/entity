package com.example.thi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "sanpham")
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "masanpham")
    private Integer maSanPham;

    @Column(name = "tensanpham")
    private String tenSanPham;

    @Column(name = "chatlieu")
    private String chatLieu;

    @Column(name = "giachatlieu")
    private BigDecimal giaChetLieu;

    @Column(name = "soluongton")
    private int soLuongTon;

    @Column(name = "loaisanpham")
    private String loaiSanPham;

    @Column(name = "mota")
    private String moTa;

    @Column(name = "mausac")
    private String mauSac;

    @Column(name = "nhasanxuat")
    private String nhaSanXuat;

    @Column(name = "trangthai")
    private int trangThai;

    @OneToMany(mappedBy = "maSanPham")
    private List<YeuThichChiTiet> yeuThichChiTietList;

    @OneToMany(mappedBy = "maSanPham")
    private List<GioHangChiTiet> gioHangChiTietList;


}
