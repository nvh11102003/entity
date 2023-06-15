package com.example.thi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "yeuthichchitiet")
public class YeuThichChiTiet {

    @Id
    @ManyToOne
    @JoinColumn(name = "madanhsach")
    private DanhSachYeuThich maDanhSach;

    @Id
    @ManyToOne
    @JoinColumn(name = "masanpham")
    private SanPham maSanPham;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "trangthai")
    private int trangThai;

    // getters setters
}
