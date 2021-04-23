/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eman Hesham
 */
public class PyramidCSVDAO {

    public PyramidCSVDAO() {
    }

    public List<Pyramid> readPyramidsFromCSV(String fileName) {
        List<Pyramid> pyramids = new ArrayList<>();
        // create an instance of BufferedReader

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // read the first line from the text file which will be head column
            String line = br.readLine();
            // loop until all lines are read
            if (line != null) {
                line = br.readLine(); // the first real data
            }
            while (line != null) {
                //System.out.println("the line " + line);
                // use string.split to load a string array with the values from each line of the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                Pyramid pyr = createPyramid(attributes);
                // adding Pyramid into ArrayList
                pyramids.add(pyr);
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return pyramids;
    }

    public Pyramid createPyramid(String[] metadata) {

        String pharaoh = metadata[0];
        String modern_name = metadata[2];
        String site = metadata[4];
        double height=0;
        if(metadata[7]!=null && metadata[7].length()>0)
            height= Double.parseDouble(metadata[7]);

        // create and return Pyramid of this metadata
        return new Pyramid(pharaoh, modern_name, site, height);
    }

}
