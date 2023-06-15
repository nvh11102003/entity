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

@Entity
@Table(name = "khachhang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "makhachhang")
    private Integer maKhachHang;

    @Column(name = "tenkhachhang")
    private String tenKhachHang;

    @Column(name = "sinhnhat")
    private Date sinhNhat;

    @Column(name = "diachi")
    private Date diaChi;

    @Column(name = "sodienthoai")
    private String soDienThoai;

    @Column(name = "email")
    private String email;

    @Column(name = "gioitinh")
    private boolean gioiTinh;

    @Column(name = "chungminhthu")
    private String chungMinhThu;

    @Column(name = "socancuoc")
    private String soCanCuoc;

    @Column(name = "anhdaidien")
    private String anhDaiDien;

    @Column(name = "trangthai")
    private int trangThai;

    @Column(name = "diemtichluy")
    private int diemTichLuy;

    @ManyToOne
    @JoinColumn(name = "hangkhachhang")
    private HangKhachHang hangKhachHang;

    @OneToMany(mappedBy = "nguoiSoHuu")
    List<PhieuGiamGia> phieuGiamGiaList;

    @OneToMany(mappedBy = "maKhachHang")
    List<GioHang> gioHangList;

    @OneToMany(mappedBy = "khachHang")
    List<DiaChi> diaChiList;

    @OneToMany(mappedBy = "nguoiMua")
    List<HoaDon> hoaDonList;

    @OneToMany(mappedBy = "maKhachHang")
    List<TheThanhVien> theThanhVienList;

    @OneToMany(mappedBy = "maKhachHang")
    List<DanhSachYeuThich> danhSachYeuThichList;

    @ManyToOne
    @JoinColumn(name = "nguoigioithieu")
    private KhachHang nguoiGioiThieu;
}
