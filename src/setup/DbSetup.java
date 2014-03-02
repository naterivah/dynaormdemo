/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setup;

import be.bittich.dynaorm.dialect.Dialect;
import be.bittich.dynaorm.setup.AbstractSetup;
import dao.DAOAuteur;
import dao.DAOCitation;
import dao.DAOCity;
import dao.DAOCountry;
import facad.DbFacad;
import java.util.Properties;
import service.AuteurService;
import service.CitationService;
import service.CityService;
import service.CountryService;

/**
 *
 * @author user
 */
public class DbSetup extends AbstractSetup {

    private static final long serialVersionUID = 4392930026200697871L;

    public DbSetup(Properties properties, Dialect dialect) {
        super(properties, dialect);
    }

    @Override
    protected void doSetup() {
        DbFacad.getContainer().registerBean("daoCity", new DAOCity());
        DbFacad.getContainer().registerBean("daoCountry", new DAOCountry());
        DbFacad.getContainer().registerBean("daoAuteur", new DAOAuteur());
        DbFacad.getContainer().registerBean("daoCitation", new DAOCitation());
        
        DbFacad.getContainer().registerBean("cityService", new CityService(DbFacad.getDAOCity()));
        DbFacad.getContainer().registerBean("countryService", new CountryService(DbFacad.getDAOCountry()));
        DbFacad.getContainer().registerBean("auteurService", new AuteurService(DbFacad.getDAOAuteur()));
        DbFacad.getContainer().registerBean("citationService", new CitationService(DbFacad.getDAOCitation()));

    }

}
