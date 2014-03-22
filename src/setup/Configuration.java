/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setup;

import be.bittich.dynaorm.core.DbPropertiesBuilder;
import be.bittich.dynaorm.dialect.Dialect;
import be.bittich.dynaorm.dialect.MySQLDialect;
import be.bittich.dynaorm.ioc.BasicContainer;
import be.bittich.dynaorm.ioc.Container;
import be.bittich.dynaorm.setup.Setup;
import java.util.Properties;

/**
 *
 * @author Nordine
 */
public class Configuration {

    public static void configure() {
        //create an instance of propertie builder
        DbPropertiesBuilder builder = new DbPropertiesBuilder();

        Properties properties = builder.setUrl("jdbc:mysql://localhost:8889/kikoo")
                .setUser("root")
                .setPassword("")
                .setInitialSize("100")
                .setDriver("mysql")
                .setAutoCommit("true")
                .toProperties();

        Dialect dialect = new MySQLDialect();

        Container container = new BasicContainer();

        Setup setup = new DbSetup(properties, dialect);
        setup.setup(container);
    }
}
