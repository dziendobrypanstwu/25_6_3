package com.example.awtSample;

import com.example.awtSample.model.Datesource;

public class Main {

    public static void main(String[] args) {

        Datesource datasource = new Datesource();
        if(!datasource.open()){
            System.out.println("Cant open datasource");
            return;
        }

        datasource.close();;


    }
}
