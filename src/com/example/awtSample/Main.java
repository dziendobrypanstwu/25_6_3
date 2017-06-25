package com.example.awtSample;

import com.example.awtSample.model.Artist;
import com.example.awtSample.model.Datesource;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Datesource datasource = new Datesource();
        if(!datasource.open()){
            System.out.println("Cant open datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtists();
        if(artists == null){
            System.out.println("No artists!");
            return;
        }
        for(Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }



        datasource.close();;


    }
}
