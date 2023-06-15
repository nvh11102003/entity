package com.example.thi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "phieugiaohang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhieuGiaoHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "maphieugiao")
    private String maPhieuTao;

    @Column(name = "nguoinhan")
    private String nguoiNhan;

    @Column(name = "nguoigiao")
    private Date ngayGiao;

    @Column(name = "sdtgiao")
    private String sdtGiao;

    @Column(name = "ngaynhan")
    private Date ngayNhan;

    @Column(name = "nguoitao")
    private String nguoiTao;

    @Column(name = "phigiaohang")
    private BigDecimal phiGiaoHang;

    @ManyToOne
    @JoinColumn(name = "hoadongiao")
    private HoaDon maHoaDon;

    @ManyToOne
    @JoinColumn(name = "diachigiao")
    private DiaChi maDiaChi;

    @Column(name = "ghichu")
    private String ghiChu;

    @Column(name = "trangthai")
    private int trangThai;

}
