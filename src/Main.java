package ir.aut;

import SearchAlgorithms.*;
import challenge2.*;


public class Main {

//    public static Node goalState = new Node("G");
//    public static Node startState = new Node("I");

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode2("Arad", 366);
        graph.addNode2("Oradea", 380);
        graph.addNode2("Zerind", 374);
        graph.addNode2("Sibiu", 253);
        graph.addNode2("Timisoara", 329);
        graph.addNode2("Lugoj", 244);
        graph.addNode2("Mehadia", 241);
        graph.addNode2("Dobreta", 242);
        graph.addNode2("Craiova", 160);
        graph.addNode2("Rimnuicu vilcea", 193);
        graph.addNode2("Pitesti", 98);
        graph.addNode2("Fagaras", 178);
        graph.addNode2("Giurgiu", 77);
        graph.addNode2("Urziceni", 80);
        graph.addNode2("Vaslui", 199);
        graph.addNode2("Iasi", 226);
        graph.addNode2("Neamt", 234);
        graph.addNode2("Hirsova", 151);
        graph.addNode2("Eforie", 161);
        graph.addNode2("Bucharest", 0);


        graph.addEdge2("Oradea", "Zerind", 71);
        graph.addEdge2("Oradea", "Sibiu", 151);
        graph.addEdge2("Arad", "Zerind", 75);
        graph.addEdge2("Arad", "Sibiu", 140);
        graph.addEdge2("Arad", "Timisoara", 118);
        graph.addEdge2("Sibiu", "Fagaras", 99);
        graph.addEdge2("Sibiu", "Rimnuicu vilcea", 80);
        graph.addEdge2("Lugoj", "Timisoara", 111);
        graph.addEdge2("Lugoj", "Mehadia", 70);
        graph.addEdge2("Dobreta", "Mehadia", 75);
        graph.addEdge2("Dobreta", "Craiova", 120);
        graph.addEdge2("Pitesti", "Craiova", 138);
        graph.addEdge2("Rimnuicu vilcea", "Craiova", 146);
        graph.addEdge2("Rimnuicu vilcea", "Pitesti", 97);
        graph.addEdge2("Pitesti", "Bucharest", 101);
        graph.addEdge2("Fagaras", "Bucharest", 211);
        graph.addEdge2("Giurgiu", "Bucharest", 90);
        graph.addEdge2("Urziceni", "Bucharest", 85);
        graph.addEdge2("Urziceni", "Vaslui", 142);
        graph.addEdge2("Urziceni", "Hirsova", 98);
        graph.addEdge2("Iasi", "Vaslui", 92);
        graph.addEdge2("Iasi", "Neamt", 87);
        graph.addEdge2("Hirsova", "Eforie", 86);


//BFS Test
//        BFS bfsGraph=new BFS();
//        bfsGraph.search(graph);
//        bfsGraph.printPath();


//DFS Test
//        DFS dfsGraph = new DFS();
//        dfsGraph.search(graph);
//        dfsGraph.printPath();


//        DLS dlsGraph = new DLS(8);
//        dlsGraph.search(graph);
//        dlsGraph.printPath();


//        int limit = 1;
//
//        IterativeDepening i = new IterativeDepening();
//        while (!i.search(graph, limit)) {
//            i.search(graph, limit);
//            limit++;
//        }
//        i.printPath();


//
//        UCS uniformCost = new UCS();
//        uniformCost.search(graph);
//        uniformCost.printPath();


//        GreedyBFS greedyBFS = new GreedyBFS();
//        greedyBFS.search(graph);
//        greedyBFS.printPath();


//
//        Astar astar = new Astar();
//        astar.search(graph);
//        astar.printPath();

//
//           BFSTree bfsTree=new BFSTree();
//          bfsTree.search(graph);


        Graph2 graph2 = new Graph2();
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex H = new Vertex("H");
        Vertex I = new Vertex("I");
        Vertex J = new Vertex("J");
        Vertex K = new Vertex("K");
        graph2.addNode(A);
        graph2.addNode(B);
        graph2.addNode(C);
        graph2.addNode(D);
        graph2.addNode(E);
        graph2.addNode(F);
        graph2.addNode(G);
        graph2.addNode(H);
        graph2.addNode(I);
        graph2.addNode(J);
        graph2.addNode(K);
        graph2.addEdge(A, C);
        graph2.addEdge(A, E);
        graph2.addEdge(A, G);
        graph2.addEdge(A, I);
        graph2.addEdge(A, K);
        graph2.addEdge(B, C);
        graph2.addEdge(B, K);
        graph2.addEdge(B, F);
        graph2.addEdge(B, H);
        graph2.addEdge(C, D);
        graph2.addEdge(D, E);
        graph2.addEdge(D, J);
        graph2.addEdge(D, H);
        graph2.addEdge(E, F);
        graph2.addEdge(G, H);
        graph2.addEdge(F, G);
        graph2.addEdge(F, J);
        graph2.addEdge(H, I);
        graph2.addEdge(I, J);
        graph2.addEdge(J, K);
        //  graph2.printGraph();

//        SimulatedAnnealing SA=new SimulatedAnnealing(graph2,3);
//        SA.coloring(graph2);
//        SA.print(graph2);


//        SimpleHC hillClimbing=new SimpleHC(graph2,3);
//        hillClimbing.simpleHC(graph2);
//        graph2.printGraphColoring();



//        StocasticHC stocasticHC=new StocasticHC(graph2,3);
//        stocasticHC.HC(graph2);
//        graph2.printGraphColoring();


//        FirstChoiceHC FCHC=new FirstChoiceHC(graph2,3);
//        FCHC.coloring(graph2);
//        graph2.printGraphColoring();


//        RandomRestartHC RRHC=new RandomRestartHC(graph2,3);
//        RRHC.simpleHC(graph2);
//        RRHC.findBest(graph2);
//        graph2.printGraphColoring();


        Genetic genetic=new Genetic(graph2,3);
        genetic.coloring();


    }
}
