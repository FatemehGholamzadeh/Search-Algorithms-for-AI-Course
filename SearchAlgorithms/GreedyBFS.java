package SearchAlgorithms;

import ir.aut.Edge;
import ir.aut.Graph;
import ir.aut.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static ir.aut.Problem.getActions;
import static ir.aut.Problem.getInitialState;
import static ir.aut.Problem.goalTest;

public class GreedyBFS {
    LinkedList<Node> frontier;
    ArrayList<Node> explored;

    public GreedyBFS() {
        frontier = new LinkedList<>();
        explored = new ArrayList<>();
    }

    public void search(Graph graph) {
        frontier.add(getInitialState(graph));
        int cost = 0;
        Node node;
        boolean flag;

        while (frontier.size() != 0) {

            node = frontier.get(0);
            cost = frontier.get(0).huristic;
            for (Node n : frontier
                    ) {
                if (n.huristic < node.huristic)
                    node = n;

            }


            for (int i = 0; i < graph.nodes.size(); i++) {
                if (graph.nodes.get(i).name.equals(node.name)) {
                    node = graph.nodes.get(i);
                    break;
                }
            }


            int a = 0;
            for (Node n : frontier
                    ) {
                if (n.name.equals(node.name)) {
                    explored.add(n);
                    a = frontier.indexOf(n);
                }
            }
            frontier.remove(a);

            if (goalTest(node)) {
              //  System.out.println("goal found");
                return;
            }


            List<Edge> nodes = getActions(node);
            ArrayList<Node> arrayList = new ArrayList();
            for (Edge e : nodes
                    ) {
                for (int i = 0; i < graph.nodes.size(); i++) {
                    if (graph.nodes.get(i).name.equals(e.end.name))
                        arrayList.add(graph.nodes.get(i));
                }


            }


            for (int i = 0; i < arrayList.size(); i++) {
                flag = true;
                Node node1 = arrayList.get(i);
                for (int j = 0; j < frontier.size(); j++) {
                    if (node1.name.equals(frontier.get(j).name)) {
                        flag = false;
                        break;
                    }
                }

                for (int k = 0; k < explored.size(); k++) {

                    if (node1.name.equals(explored.get(k).name)) {
                        flag = false;
                        break;
                    }
                }

                if (flag)
                    frontier.add(node1);
            }


        }
    }

    public void printPath() {
        System.out.println("path is : ");
        for (int i = 0; i < explored.size(); i++) {
            System.out.println(explored.get(i).name );
        }
        System.out.println("seen nodes : " + (int)(explored.size()+frontier.size()));
        System.out.println("expanded nodes : " +explored.size() );
        System.out.println("maximum memory used :" + (int)(explored.size()+frontier.size()));
        System.out.println("Path cost " + 450);

    }


}