package com.maryanto.dimas.example.dao.perpustakaan;

import com.maryanto.dimas.example.dao.CrudRepository;
import com.maryanto.dimas.example.entity.perpustakaan.Transaksi;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class TransaksiDao implements CrudRepository<Transaksi, String> {

    private Connection connection;

    public TransaksiDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Transaksi save(Transaksi value) throws SQLException {
        return null;
    }

    @Override
    public Transaksi update(Transaksi value) throws SQLException {
        return null;
    }

    @Override
    public Boolean removeById(String value) throws SQLException {
        return null;
    }

    @Override
    public Optional<Transaksi> findById(String value) throws SQLException {
        return Optional.empty();
    }

    @Override
    public List<Transaksi> findAll() throws SQLException {
        return null;
    }

    @Override
    public List<Transaksi> findAll(Long start, Long limit, Long orderIndex, String orderDirection, Transaksi param) throws SQLException {
        return null;
    }
}