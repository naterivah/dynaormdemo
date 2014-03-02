/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import be.bittich.dynaorm.core.TableColumn;
import be.bittich.dynaorm.swing.BeanTableModel;
import entity.City;
import facad.DbFacad;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import service.Service;

/**
 *
 * @author Nordine
 */
public class JFrameCity extends JFrame {

    private static final long serialVersionUID = -8066436478217983784L;

    public JFrameCity() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("City JFrame");
        setSize(600, 600);
        JTable tableBean = new JTable();

        //bind cityService
        Service<City> cityService = DbFacad.getCityService();
        //create a BeanTableModel
        BeanTableModel<City> model = new BeanTableModel(City.class);
        //get the table columns
        TableColumn columns = cityService.getTableColumn();
        System.out.println(columns.getColumns());
        //add all columns to the model
        model.addAllColumns(columns);

        //get all cities
        List listCities = cityService.findAll();

        //add all cities to the model
        model.addRows(listCities);

        //set the model for our jTable
        tableBean.setModel(model);

        //add the table to the JFrame
        setContentPane(new JScrollPane(tableBean));
    }
}
