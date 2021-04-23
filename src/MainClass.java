/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Eman Hesham
 */
public class MainClass {

    public static void main(String[] args) {

        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        System.out.println("hello pyramids");
        //List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("D:\\pyramids.csv");
        List<Pyramid> pyramids;
        pyramids = pDAO.readPyramidsFromCSV("E:\\ITI\\01_Development\\Java & UML Programming for AIs\\General\\Ghozia\\Day3\\Session 03 JUPAI3 File handling and data extraction\\pyramids.csv");


        // let's print all the pyramids read from CSV file
        int i=0;
        for(Pyramid p:pyramids)
        {
            System.out.println("#"+(i++)+p);
        }


    }

}
