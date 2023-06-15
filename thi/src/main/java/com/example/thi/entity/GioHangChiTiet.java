package com.example.thi.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "giohangchitiet")
public class GioHangChiTiet {
    @Id
    @ManyToOne
    @JoinColumn(name = "magiohang")
    private GioHang maGioHang;

    @Id
    @ManyToOne
    @JoinColumn(name = "masanpham")
    private SanPham maSanPham;

    @Column(name = "soluong")
    private int soLuong;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "trangthai")
    private int trangThai;
}
