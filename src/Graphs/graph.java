package Graphs;
import java.util.ArrayList;
import java.util.Scanner;

public class graph {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();
        ArrayList[] li = new ArrayList[nodes + 1];

        for(int i=1;i<=nodes;i++){
            li[i]= new ArrayList<Integer>();
        }

        for(int i = 1;i<=edges;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            li[u].add(v);
            li[v].add(u);
        }
        for(int i=1;i<nodes;i++) System.out.println(li[i]);
    }
}
