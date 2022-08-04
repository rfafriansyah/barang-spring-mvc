package com.belajar.belajar.model;

import lombok.Data;

@Data
public class Barang {
    private Long id;
    private String nama;
    private int stok;
    private String satuan;
    private Double harga;
}
