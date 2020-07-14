package com.maryanto.dimas.example.entity.perpustakaan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDetail {

    private String id;
    private Transaksi transaksi;
    private Buku buku;
    private Date tanggalKembali;
}
