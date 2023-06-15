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
@Table(name = "hoadon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahoadon")
    private long maHoaDon;

    @Column(name = "ngaylap")
    private Date ngayLap;

    @Column(name = "nguoilap")
    private String nguoiLap;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "ngaythanhtoan")
    private Date ngayThanhToan;

    @Column(name = "trangthai")
    private int trangThai;

    @ManyToOne
    @JoinColumn(name = "nguoimua")
    private KhachHang nguoiMua;

    @OneToMany(mappedBy = "maHoaDon")
    private List<PhieuGiaoHang> phieuGiaoHangList;

    @OneToMany(mappedBy = "maHoaDon")
    private List<HoaDonChiTiet> hoaDonChiTietList;
}
