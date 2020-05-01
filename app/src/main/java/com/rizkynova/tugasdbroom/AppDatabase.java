package com.rizkynova.tugasdbroom;
/*
Tanggal : 1 Mei 2020 13:15
Jam     : 01:48 WIB
Nama    : Rizky Novayandi
Kelas   : IF4
NIM     : 10117140
Email   : rizkynovayandiofficial@gmail.com

 */

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}
