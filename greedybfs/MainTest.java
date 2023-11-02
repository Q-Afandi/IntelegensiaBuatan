/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package greedybfs;

/**
 *
 * @author Afandi
 */
public class MainTest {
    
    public static void main(String[] args) {
        Node bandung = new Node("Bandung");
        Node cimahi = new Node("Cimahi");
        Node padalarang = new Node("Padalarang");
        Node cipatat = new Node("Cipatat");
        Node sukaluyu = new Node("Sukaluyu");
        Node cianjur = new Node("Cianjur");
        

        NodeUCS bandungUCS = new NodeUCS(bandung, 0);
        NodeUCS cimahiUCS = new NodeUCS(cimahi, 11);
        NodeUCS padalarangUCS = new NodeUCS(padalarang, 13);
        NodeUCS cipatatUCS = new NodeUCS(cipatat, 15);
        NodeUCS sukaluyuUCS = new NodeUCS(sukaluyu, 14);
        NodeUCS cianjurUCS = new NodeUCS(cianjur, 30);

        bandungUCS.addTetangga(cimahiUCS);

        cimahiUCS.addTetangga(bandungUCS);
        cimahiUCS.addTetangga(padalarangUCS);

        padalarangUCS.addTetangga(cimahiUCS);
        padalarangUCS.addTetangga(cipatatUCS);

        cipatatUCS.addTetangga(padalarangUCS);
        cipatatUCS.addTetangga(sukaluyuUCS);

        sukaluyuUCS.addTetangga(cipatatUCS);
        sukaluyuUCS.addTetangga(cianjurUCS);

        cianjurUCS.addTetangga(sukaluyuUCS);
        
        //Menampilkan hasil dari Algoritma GreedyBFS
        System.out.println("Greedy BFS");
        //Inisialisasi Objek GreedyBFS
        GreedyBFS bfs = new GreedyBFS();
        // Memanggil fungsi search dari objek GreedyBestFirstSearch dari node bandungUCS ke pangandaranUCS
        bfs.search(cianjurUCS, bandungUCS);
        System.out.println();   

       
    }
}
