/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHSAN
 */
public class pengolah {
    double[][] nilai;

    public pengolah(double[][] nilai) {
        this.nilai = nilai;
    }
    
    public void printNilai(int r, int c){
        System.out.print(""+nilai[r][c]);
    }
    
    public void cetakData(String data){
        System.out.println(data);
    }
    
    public double getRataP(int r){
        double result = 0;
        double temp = Math.pow(10, 2);
        result =  ((nilai[r][0]+nilai[r][1]+nilai[r][2])/nilai[r].length);
        result = (double) Math.round(result*temp)/temp;
        return result;
    }
    
     public double getRataS(int c){
        double result = 0;
        double temp = Math.pow(10, 2);
        result =  ((nilai[0][c]+nilai[1][c]+nilai[2][c]+nilai[3][c])/nilai.length);
        result = (double) Math.round(result*temp)/temp;
        return result;
    }
    
    public int getMaxRata(double rata[]){
        int result = 0;
        double maxNilai=rata[0];
        for (int i = 0; i <rata.length; i++) {
            if (rata[i]>maxNilai) {
                maxNilai=rata[i];
                result = i;
            }
        }
        return result;
    }
    
    public int getMinRata(double rata[]){
        int result = 0;
        double minNilai=rata[0];
        for (int i = 0; i < rata.length; i++) {
            if (rata[i]<minNilai) {
                minNilai=rata[i];
                result = i;
            }
        }
        return result;
    }
}
