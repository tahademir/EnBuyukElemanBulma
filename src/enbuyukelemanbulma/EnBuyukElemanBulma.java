/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enbuyukelemanbulma;

import java.util.Scanner;

/**
 *
 * @author taha
 */
public class EnBuyukElemanBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int uzunluk = 0;
		System.out.println("Dizinin uzunluğunu giriniz :");
		Scanner girilenSayi = new Scanner(System.in);      // Dizinin uzunlugunu kullanıcıdan alıyoruz
        uzunluk= girilenSayi.nextInt();    // Alınan uzunluk değişkene aktırılıyor
		int dizi[] = new int[uzunluk];    // Dizinin boyutunu kullanıcının istediği boyuta göre tanımlıyoruz
		for (int i = 0; i < dizi.length; i++) {    // Dizinin uzunluğu kadar kullanıcıdan eleman girmesini sağlıyoruz
			System.out.println((i+1)+". elamanı giriniz");
			Scanner sayilar = new Scanner(System.in);
			dizi[i]= sayilar.nextInt();
		}
		enBuyuk(dizi);    // Dizinin en büyük elemanını bulması için "enBuyuk" metodunu çağırıyoruz
		
    }
    public static void enBuyuk(int dizi[]){
		 int enbuyuk = dizi[0];    // Dizinin 0. indeksini en büyüyk olarak atıyoruz
	        for (int i=1 ; i<dizi.length; i++){    // Dizinin içersindeki en büyük sayıyı buluyoruz
	            if(enbuyuk < dizi[i])
	                enbuyuk = dizi[i];
	            
	        }
                System.out.println("Dizinin en büyük elemanı :"+ enbuyuk);
	}
    
}
