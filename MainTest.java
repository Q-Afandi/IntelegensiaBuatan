package id.ac.unpas.ib;

import id.ac.unpas.ib.bfs.BreadthFirstSearch;
import id.ac.unpas.ib.dls.DepthLimitedSearch;
import id.ac.unpas.ib.ucs.NodeUCS;
import id.ac.unpas.ib.ucs.UniformCostSearch;

public class MainTest {
    public static void main(String[] args) {
        Node bandung = new Node("Bandung");
        Node cimahi = new Node("Cimahi");
        Node padalarang = new Node("Padalarang");
        Node cipatat = new Node("Cipatat");
        Node sukaluyu = new Node("Sukaluyu");
        Node cianjur = new Node("Cianjur");
        

        bandung.addTetangga(cimahi);

        cimahi.addTetangga(bandung);
        cimahi.addTetangga(padalarang);

        padalarang.addTetangga(cimahi);
        padalarang.addTetangga(cipatat);

        cipatat.addTetangga(padalarang);
        cipatat.addTetangga(sukaluyu);

        sukaluyu.addTetangga(cipatat);
        sukaluyu.addTetangga(cianjur);

        cianjur.addTetangga(sukaluyu);

        

        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(cianjur, bandung);
        System.out.println();

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(cianjur, bandung);
        System.out.println();

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

        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(cianjurUCS, bandungUCS);
        System.out.println();
    }
}
