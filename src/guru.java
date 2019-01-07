/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class guru {
    BufferedReader bf;
    double[][] nilai = new double[4][3];
    double rataP[] = new double[4];
    double rataS[] = new double[3];
    
    protected guru(){
        bf = new BufferedReader(new InputStreamReader(System.in));
        InputNilai();
        cetakNilai();
    }
    public void cetakNilai(){
        pengolah nilaip = new pengolah(nilai);
        rataPerp(nilaip);
        rataPers(nilaip);
        System.out.println("");
        System.out.println("============================================== Nilai Siswa ================================================");
        System.out.println("===========================================================================================================");
        DataSemua();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        cetakRataPers();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        cetakRataPerp();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Rata-rata Pelajaran Tertinggi : Pelajaran "+(nilaip.getMaxRata(rataP)+1));
        System.out.println("Rata-rata Pelajaran Terendah : Pelajaran "+(nilaip.getMinRata(rataP)+1));
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("Rata-rata Siswa Tertinggi : Pelajaran "+(nilaip.getMaxRata(rataS)+1));
        System.out.println("Rata-rata Siswa Terendah : Pelajaran "+(nilaip.getMinRata(rataS)+1));
        System.out.println("===========================================================================================================");
    }
    
    public void rataPers(pengolah nilaip){
        for (int i = 0; i < 3; i++) {
            rataS[i]=nilaip.getRataS(i); 
            }
        }
    
    public void rataPerp(pengolah nilaip){
        for (int i = 0; i < nilai.length; i++) {
            rataP[i]=nilaip.getRataP(i); 
            }
        }
    
    public void cetakRataPers(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Rata-rata nilai Siswa "+(i+1)+" "+rataS[i]);
            }
        }
    
    public void cetakRataPerp(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Rata-rata nilai Pelajaran "+(i+1)+" "+rataP[i]);
            }
        }
    
    public void DataSemua(){
        System.out.printf("%10s %20s %5s %5s %5s %5s ", "Siswa", "Pelajaran 1", "Pelajaran 2", "Pelajaran 3", "Pelajaran 4", "Rata-rata");
        System.out.println("");System.out.println("-----------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%10s %20s %10s %10s %10s %10s", "Siswa "+(i+1)+"",""+nilai[0][i]+"",""+nilai[1][i]+"",""+nilai[2][i]+"",""+nilai[3][i]+"",""+rataS[i]+"");
            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %10s %10s %10s", "Rata-rata pelajaran ",""+rataP[0]+"",""+rataP[1]+"",""+rataP[2]+"",""+rataP[3]+"","-");
        System.out.println("");System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
    
    public void InputNilai(){
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length ; j++) {
                System.out.print("Input Nilai Pelajaran "+(i+1)+" Siswa "+(j+1)+" : ");
                try {
                    nilai[i][j]=Double.parseDouble(bf.readLine());
                } catch (Exception e) {
                    System.out.println(e.toString());
                }   
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        guru Guru = new guru();
    }
}

    

