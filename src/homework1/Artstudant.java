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
public class Artstudant extends Studant {
    
    private double mid;
private double finale;
private double report;

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public double getFinale() {
        return finale;
    }

    public void setFinale(double finale) {
        this.finale = finale;
    }

    public double getReport() {
        return report;
    }

    public void setReport(double report) {
        this.report = report;
    }

    public Artstudant(int id ,String name, String major,double mid, double finale, double report) {
        super(id, name, major);
        this.mid = mid;
        this.finale = finale;
        this.report = report;
    }

    @Override
    public double grate() {
        return   mid*0.40 + report*0.10 + finale*50;
    }
    
}
