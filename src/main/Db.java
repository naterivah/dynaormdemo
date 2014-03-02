/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Auteur;
import entity.Citation;
import facad.DbFacad;
import java.util.List;
import service.Service;
import setup.Configuration;
import swing.JFrameCity;

/**
 *
 * @author user
 */
public class Db {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //configuration (setup,...)
        Configuration.configure();

        Service<Citation> cityService = DbFacad.getCitationService();
        Service<Auteur> auteurService = DbFacad.getAuteurService();

        List<Citation> list = cityService.findAll();

        for (Citation c : list) {
            System.out.println(c);
        }
        
        Auteur aut = auteurService.findById(new Auteur(2));
        Citation c = cityService.findById(new Citation(13));
        System.out.println(c);
        System.out.println(aut);

        new JFrameCity().setVisible(true);

    }

}
