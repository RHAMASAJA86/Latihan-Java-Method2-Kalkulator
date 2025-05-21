package latihanmethod2;

import javax.swing.JOptionPane;

public class LatihanMethod2 {
    void kalkulator(String operasi, double bill, double bil2) {
        double hasil = 0;
        switch (operasi) {
            case "Penjumplahan":
                hasil = bill + bil2;
                break;
            case "Pengurangan":
                hasil = bill - bil2;
                break;
            case "Perkalian":
                hasil = bill * bil2;
                break;
            case "Pembagian":
                if(bil2 != 0) {
                    hasil = bill / bil2;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Pembagian dengan nol tidak diperbolehkan!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Inputanmu SALAH!", "Error", JOptionPane.ERROR_MESSAGE);
                return;     
        }
        String txtmessage = "Hasil Operasi " + operasi + " dari " + bill + " dan " + bil2 + " adalah " + hasil;
        JOptionPane.showMessageDialog(null, txtmessage, "Hasil Operasi", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        LatihanMethod2 P = new LatihanMethod2();
        String operasi = JOptionPane.showInputDialog(null, "Pilih jenis operasi : \n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian");
        
        switch (operasi) {
            case "1":
                operasi = "Penjumplahan";
                break;
            case "2":
                operasi = "pengurangan";
                break;
            case "3":
                operasi = "perkalian";
                break;
            case "4":
                operasi = "pembagian";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Inputanmu SALAH!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        } 
        
        String input1 = JOptionPane.showInputDialog(null, "Masukkan angka pertama");
        String input2 = JOptionPane.showInputDialog(null, "Masukkan angka kedua");
        
        try {
            double bil1 = Double.parseDouble(input1);
            double bil2 = Double.parseDouble(input2);
            P.kalkulator(operasi, bil1, bil2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Inputanmu SALAH harusnya ANGKA!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }   
}