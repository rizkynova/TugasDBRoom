package com.rizkynova.tugasdbroom;

/*
Tanggal : 1 Mei 2020 13:15
Jam     : 01:48 WIB
Nama    : Rizky Novayandi
Kelas   : IF4
NIM     : 10117140
Email   : rizkynovayandiofficial@gmail.com

 */


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class AktivisEntity {

    @PrimaryKey(autoGenerate = true)
    private int idAktivis;
    @ColumnInfo(name = "namaAktivis")
    private String namaAktivis;
    @ColumnInfo(name = "emailAktivis")
    private String emailAktivis;
    @ColumnInfo(name = "zonaTugas")
    private String zonaTugas;

    public int getIdAktivis() {
        return idAktivis;
    }

    public void setIdAktivis(int idAktivis) {
        this.idAktivis = idAktivis;
    }

    public String getNamaAktivis() {
        return namaAktivis;
    }

    public void setNamaAktivis(String namaAktivis) {
        this.namaAktivis = namaAktivis;
    }

    public String getEmailAktivis() {
        return emailAktivis;
    }

    public void setEmailAktivis(String emailAktivis) {
        this.emailAktivis = emailAktivis;
    }

    public String getZonaTugas() {
        return zonaTugas;
    }

    public void setZonaTugas(String zonaTugas) {
        this.zonaTugas = zonaTugas;
    }
}
