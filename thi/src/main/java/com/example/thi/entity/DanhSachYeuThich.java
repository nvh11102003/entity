package com.example.thi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "danhsachyeuthich")
public class DanhSachYeuThich {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "madanhsach")
    private String maDanhSach;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @Column(name = "ngaycapnhap")
    private Date ngayCapNhap;

    @ManyToOne
    @JoinColumn(name = "nguoisohuu")
    private KhachHang maKhachHang;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "trangthai")
    private int trangThai;

    @OneToMany(mappedBy = "maDanhSach")
    private List<YeuThichChiTiet> yeuThichChiTietList;
}
