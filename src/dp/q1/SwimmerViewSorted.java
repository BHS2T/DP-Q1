/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.q1;

/**
 *
 * @author Tsiyon
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwimmerViewSorted {
    
    public static List<Swimmer> swimmerList = new ArrayList<Swimmer>();
    public SwimmerViewSorted(){
    Swimmer swimmer = new Swimmer("Tsiyon","F",25,25);
    Swimmer swimmer1 = new Swimmer("Hilina","F",22,22);
    Swimmer swimmer2 = new Swimmer("Samrawit","F",23,23);
    
    swimmerList.add(swimmer);
    swimmerList.add(swimmer1);
    swimmerList.add(swimmer2);
    }
    public List<Swimmer> returnNotSorted(){
        return swimmerList;
    }
    public List<Swimmer> sortSwimmerData(String sortBy) {
        if (sortBy.equalsIgnoreCase("time")) {
            sort("time");
        }
        if (sortBy.equalsIgnoreCase("age")) {
            sort("age");
        }
        if (sortBy.equalsIgnoreCase("sex")) {
            sort("sex");
        }
        return swimmerList;
    }
    

    public void sort(String sortBy) {
        List<String> s;
        List<String> sorted;

        Collections.sort(swimmerList, (Swimmer s1, Swimmer s2) -> {
            if (sortBy.equalsIgnoreCase("time")) {
                System.out.println("Here i am");
                String ss1 = Float.toString(s1.time); 
                String ss2 = Float.toString(s2.time);
                int result = ss1.compareToIgnoreCase(ss2);

                if (result > 0) {
                    return 1;   //p1 is more than p2
                }
                if (result < 0) {
                    return -1;
                }
            }
            if (sortBy.equalsIgnoreCase("age")) {
                System.out.println("Here i am age");

                String ss1 = Integer.toString(s1.age); 
                String ss2 = Integer.toString(s2.age);
                int result = ss1.compareToIgnoreCase(ss2);

                if (result > 0) {
                    return 1;   //p1 is more than p2
                }
                if (result < 0) {
                    return -1;
                }
            }
            if (sortBy.equalsIgnoreCase("sex")) {
                int result = s1.sex.compareToIgnoreCase(s2.sex);

                if (result > 0) {
                    return 1;   //p1 is more than p2
                }
                if (result < 0) {
                    return -1;
                }
            }

            return 0;
        });
    }

}
