package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SacramentoUtil {


    private ArrayList<Crime> crimes;

    public SacramentoUtil() {

        this.crimes = new ArrayList<>();
    }

    public void readSacramentoCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Helix2\\Downloads\\SacramentocrimeJanuary2006.txt"))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i > 0) {
                    // 9 elemű lesz
                    String[] csvRow = line.split(",");
                    Crime crime = new Crime();
                    crime.setcDateTime(csvRow[0]);
                    crime.setAddress(csvRow[1]);
                    crime.setDistrict(Integer.parseInt(csvRow[2]));
                    crime.setBeat(csvRow[3]);
                    crime.setGrid(Integer.parseInt(csvRow[4]));
                    crime.setCrimeDescr(csvRow[5]);
                    crime.setUcrNcicCode(Integer.parseInt(csvRow[6]));
                    crime.setLatitude(Float.parseFloat(csvRow[7]));
                    crime.setLongitude(Float.parseFloat(csvRow[8]));
                    crimes.add(crime);
                }
                ++i;
            }
            System.out.println(crimes.size());


        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
