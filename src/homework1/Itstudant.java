/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author hp
 */
public class Itstudant extends Studant {
private double mid;
private double finale;
private double project;

    public Itstudant( int id ,String name, String major,double mid, double finale, double project) {
        super(id, name, major);
        this.mid = mid;
        this.finale = finale;
        this.project = project;
        
    }

    @Override
    public double grate() {
        return  mid*0.30 + project*0.30 + finale*40;
    }
    
    
}
