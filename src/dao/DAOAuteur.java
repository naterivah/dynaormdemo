/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import be.bittich.dynaorm.maping.ForeignKeyMapping;
import static be.bittich.dynaorm.maping.ReflectionMapper.lazyLoadRelationList;
import be.bittich.dynaorm.repository.GenericDynaRepository;
import entity.Auteur;
import facad.DbFacad;

/**
 *
 * @author Nordine
 */
public class DAOAuteur extends GenericDynaRepository<Auteur> {

    private static final long serialVersionUID = 599234185754510852L;

    @Override
    public void loadInvoker(Auteur auteur) {
        ForeignKeyMapping keyMapping = new ForeignKeyMapping(auteur.getId().toString(), "auteur_id");
        auteur.setCitations(lazyLoadRelationList(keyMapping,DbFacad.getDAOCitation()));
    }
}
