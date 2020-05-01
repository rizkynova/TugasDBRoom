package com.rizkynova.tugasdbroom;
/*
Tanggal : 1 Mei 2020 13:15
Jam     : 01:48 WIB
Nama    : Rizky Novayandi
Kelas   : IF4
NIM     : 10117140
Email   : rizkynovayandiofficial@gmail.com

 */

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AktivisDao {

    @Insert
    void tambahAktivis(AktivisEntity aktivisEntity);

    @Delete
    public void hapusAktivis(AktivisEntity aktivisEntity);

    @Query("SELECT * FROM AktivisEntity")
    List<AktivisEntity> tampilSeluruhAktivis();

    @Query("SELECT * FROM AktivisEntity WHERE zonaTugas LIKE :zona")
    List<AktivisEntity> findByZone(String zona);

}
