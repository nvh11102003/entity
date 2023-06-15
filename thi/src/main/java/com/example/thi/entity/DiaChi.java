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

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "diachi")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiaChi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "madiachi")
    private String maDiaChi;

    @Column(name = "tendiachi")
    private String tendiachi;

    @Column(name = "motachitiet")
    private String moTaChiTiet;

    @Column(name = "tinhthanhpho")
    private String tinhThanhPho;

    @Column(name = "quanhuyen")
    private String quanHuyen;

    @Column(name = "phuongxa")
    private String phuongXa;

    @Column(name = "duongpho")
    private String duongPho;

    @ManyToOne
    @JoinColumn(name = "makhachhang")
    private KhachHang khachHang;

    @OneToMany(mappedBy = "maDiaChi")
    private List<PhieuGiaoHang> phieuGiaoHangList;
}
