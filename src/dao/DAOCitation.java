/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static be.bittich.dynaorm.maping.ReflectionMapper.lazyLoadRelation;
import be.bittich.dynaorm.repository.GenericDynaRepository;
import entity.Auteur;
import entity.Citation;
import facad.DbFacad;

/**
 *
 * @author Nordine
 */
public class DAOCitation extends GenericDynaRepository<Citation> {

    private static final long serialVersionUID = 3637879240973055122L;

    /**
     * Callback method after findById,findAll, findBy.
     * @param citationX
     */
    @Override
    public void loadInvoker(Citation citationX) {
        //create a new auteur
        Auteur auteur = new Auteur();

        //set id
        auteur.setId(citationX.getAuteurId());

        //lazy load the auteur 
        citationX.setAuteur(lazyLoadRelation(auteur,DbFacad.getDAOAuteur()));
    }
}
