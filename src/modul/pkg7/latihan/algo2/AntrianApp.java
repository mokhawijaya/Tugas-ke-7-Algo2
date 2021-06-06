/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg7.latihan.algo2;

/**
 *
 * @author LENOVO
 */
public class AntrianApp {
    public static void main(String[] args){
        Antrian antrian = new Antrian(10);
        antrian.enqueue(73);
        antrian.display();
        antrian.enqueue(45);
        antrian.display();
        antrian.enqueue(80);
        antrian.display();
        System.out.println("Yang diambil dari antrian = "+antrian.dequeue());
        antrian.display();
        System.out.println("Yang diambil dari antrian = "+antrian.dequeue());
        antrian.display();
    }
}
