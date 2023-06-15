package com.example.thi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "hoadonchitiet")
public class HoaDonChiTiet {

    @Id
    @ManyToOne
    @JoinColumn(name = "mahoadon")
    private HoaDon maHoaDon;

    @Id
    @ManyToOne
    @JoinColumn(name = "masanpham")
    private SanPham sanPham;

    @Column(name = "soluong")
    private int soLuong;

    @Column(name = "dongia")
    private BigDecimal donGia;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "trangthai")
    private int trangThai;
}
