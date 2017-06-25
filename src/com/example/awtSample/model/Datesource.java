package com.example.awtSample.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Jan PC on 6/25/2017.
 */
public class Datesource {

    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/Jan PC/IdeaProjects/25_6_3/" + DB_NAME;

    public static final  String TABLE_ALBUMS = "albums";
    public static final  String COLUMN_ALBUM_ID = "_id";
    public static final  String COLUMN_ALBUM_NAME = "name";
    public static final  String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONG = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";

    private Connection connection;

    public boolean open(){
        try{
            connection = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Couldnt connect to databse: " + e.getMessage());
            return false;
        }
    }

    public void close(){
        try{
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldnt close connection: " + e.getMessage());
        }
    }

}
