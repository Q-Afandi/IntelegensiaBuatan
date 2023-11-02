/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package greedybfs;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Afandi
 */
public class NodeUCS {
    // Nilai untuk menyimpan nama node
    private String nilai;
    // cost untuk menyimpan biaya dari node
    private int cost;
    // Tetangga untuk menyimpan node tetangga dari node yang bersangkutan
    private List<NodeUCS> tetangga;

    // Constructor untuk menginisialisasi nilai dan cost dari node
    public NodeUCS(Node node, int cost) {
        // Nilai diambil dari node yang bersangkutan
        this.nilai = node.getNilai();
        // cost diambil dari parameter cost
        this.cost = cost;
        // Inisialisasi tetangga
        tetangga = new ArrayList<>();
    }

    // Fungsi untuk mengembalikan nama node
    public String getNilai() {
        // Mengembalikan nama node
        return nilai;
    }

    // Fungsi untuk mengubah nama node
    public void setNilai(String nilai) {
        // Mengubah nama node dari parameter
        this.nilai = nilai;
    }

    // Fungsi untuk mengubah nilai biaya dari node
    public void setCost(int cost) {
        // Mengubah nilai biaya dari parameter
        this.cost = cost;
    }

    // Fungsi untuk mengembalikan nilai biaya dari node
    public int getCost() {
        // Mengembalikan nilai biaya dari node
        return cost;
    }

    // Fungsi untuk mengubah tetangga dari node
    public void setTetangga(List<NodeUCS> tetangga) {
        // Mengubah tetangga dari parameter
        this.tetangga = tetangga;
    }

    // Fungsi untuk mengembalikan tetangga dari node
    public List<NodeUCS> getTetangga() {
        // Mengembalikan tetangga dari node
        return tetangga;
    }

    // Fungsi untuk menambahkan tetangga dari node
    public void addTetangga(NodeUCS node) {
        // Menambahkan tetangga dari parameter
        tetangga.add(node);
    }

    @Override
    public boolean equals(Object obj) {
        //jik objek sama dengan node
        if (obj instanceof NodeUCS) {
            //Mengembalikan nilai pakah nilai dari obkel yang sama dengan nilai dari node
            return ((NodeUCS) obj).nilai.equals(this.nilai);
        }
        //mengembalikan nilai false
        return false;
    }
}
