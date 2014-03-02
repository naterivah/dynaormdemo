/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facad;

import be.bittich.dynaorm.facad.IOCFacadGet;
import be.bittich.dynaorm.repository.DynaRepository;
import service.Service;

/**
 *
 * @author user
 */
public class DbFacad extends IOCFacadGet {

    public static DynaRepository getDAOCity() {
        return getContainer().injectSafely("daoCity");
    }

    public static DynaRepository getDAOCountry() {
        return getContainer().injectSafely("daoCountry");
    }

    public static DynaRepository getDAOCitation() {
        return getContainer().injectSafely("daoCitation");
    }

    public static DynaRepository getDAOAuteur() {
        return getContainer().injectSafely("daoAuteur");
    }

    public static Service getCountryService() {
        return getContainer().injectSafely("countryService");
    }

    public static Service getCitationService() {
        return getContainer().injectSafely("citationService");
    }

    public static Service getAuteurService() {
        return getContainer().injectSafely("auteurService");
    }

    public static Service getCityService() {
        return getContainer().injectSafely("cityService");
    }
}
