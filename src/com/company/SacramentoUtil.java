package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SacramentoUtil {


    private ArrayList<Crime> crimes;

    public SacramentoUtil(){

        this.crimes= new ArrayList<>();
    }
    public void readSacramentoCSV(){
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Helix2\\Downloads"))) {
String line;

            while ((line = br.readLine()) != null) {


            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
