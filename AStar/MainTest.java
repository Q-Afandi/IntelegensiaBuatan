/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AStar;

/**
 *
 * @author Afandi
 */
//main program
public class MainTest {
    //fungsi main
    public static void main(String[] args) {
        // Menginisialisasi Node
        Node bandung = new Node("Bandung");
        Node cimahi = new Node("Cimahi");
        Node padalarang = new Node("Padalarang");
        Node cipatat = new Node("Cipatat");
        Node sukaluyu = new Node("Sukaluyu");
        Node cianjur = new Node("Cianjur");
        
        //Menginisialisasi Node yang ada dengan cost
        NodeUCS bandungUCS = new NodeUCS(bandung, 0);
        NodeUCS cimahiUCS = new NodeUCS(cimahi, 11);
        NodeUCS padalarangUCS = new NodeUCS(padalarang, 13);
        NodeUCS cipatatUCS = new NodeUCS(cipatat, 15);
        NodeUCS sukaluyuUCS = new NodeUCS(sukaluyu, 14);
        NodeUCS cianjurUCS = new NodeUCS(cianjur, 30);

        //Menambahkan Tetangga dari masing masin cost
        bandungUCS.addTetangga(cimahiUCS, 0);

        cimahiUCS.addTetangga(bandungUCS, 11);
        cimahiUCS.addTetangga(padalarangUCS, 13);

        padalarangUCS.addTetangga(cimahiUCS, 15);
        padalarangUCS.addTetangga(cipatatUCS, 18);

        cipatatUCS.addTetangga(padalarangUCS, 20);
        cipatatUCS.addTetangga(sukaluyuUCS, 22);

        sukaluyuUCS.addTetangga(cipatatUCS, 23);
        sukaluyuUCS.addTetangga(cianjurUCS, 26);

        cianjurUCS.addTetangga(sukaluyuUCS, 30);
        
        //Menampilkan hasil dari Algoritma A*
        System.out.println("A*");
        //Inisialisasi Objek A*
        AStar aStar = new AStar();
        // Memanggil fungsi search dari objek AStar dari node bandungUCS ke pangandaranUCS
        aStar.search(cianjurUCS, bandungUCS);
        System.out.println();   

       
    }
}
