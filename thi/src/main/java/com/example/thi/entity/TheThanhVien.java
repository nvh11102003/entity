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

import java.util.Date;

@Entity
@Table(name = "thethanhvien")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TheThanhVien {

    @Id
    @Column(name = "mathe")
    private String maThe;

    @Column(name = "mauthe")
    private String mauThe;

    @Column(name = "loaithe")
    private String loaiThe;

    @Column(name = "ngayphathanh")
    private Date ngayPhatHang;

    @Column(name = "ngayhuy")
    private Date ngayHuy;

    @Column(name = "trangthai")
    private int trangThai;

    @ManyToOne
    @JoinColumn(name = "nguoisudung")
    private KhachHang maKhachHang;
}
