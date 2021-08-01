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

public class Astar {
    ArrayList<Node> explored;
    LinkedList<Node> frontier;
    public int costToGoal = 0;

    public Astar() {
        explored = new ArrayList<>();
        frontier = new LinkedList<Node>();
    }

    public void search(Graph graph) {

        for (Node n : graph.nodes
                ) {
            n.pathcost = n.huristic;
        }


        frontier.add(getInitialState(graph));
        Node node;
        boolean flag;
        boolean flag2;


        while (frontier.size() != 0) {
            node = frontier.get(0);
            //   int pathCost = frontier.get(0).pathcost;
            for (Node n : frontier
                    ) {
                if (n.pathcost < node.pathcost)
                    //****todo
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

            if (goalTest(node))
                return;


            List<Edge> nodes = getActions(node);
            ArrayList<Node> arrayList = new ArrayList();
            for (Edge e : nodes
                    ) {

                for (int i = 0; i < graph.nodes.size(); i++) {
                    if (graph.nodes.get(i).name.equals(e.end.name))
                        arrayList.add(graph.nodes.get(i));
                }


//                flag2 = true;
//                for (int k = 0; k < explored.size(); k++) {
//
//                    if (e.end.name.equals(explored.get(k).name)) {
//                        flag2 = false;
//                        break;
//                    }
//                }
//                if (flag2) {
                for (int i = 0; i < graph.nodes.size(); i++) {
                    if (graph.nodes.get(i).name.equals(e.end.name))

                    {
                        for (int j = 0; j < graph.nodes.size(); j++) {
                            if (e.start.name.equals(graph.nodes.get(j).name) && (graph.nodes.get(i).huristic + (int) (e.cost + graph.nodes.get(j).pathcost - graph.nodes.get(j).huristic ) != 450)) {

                                graph.nodes.get(i).pathcost = graph.nodes.get(i).huristic + (int) (e.cost + graph.nodes.get(j).pathcost - graph.nodes.get(j).huristic);
                            }
                            //todo
                            //   System.out.println(graph.nodes.get(i).pathcost);
                        }
                      //  System.out.println(graph.nodes.get(i).name);
                      //  System.out.println(graph.nodes.get(i).pathcost);
                    }

                    costToGoal=graph.nodes.get(i).pathcost;
                }
              //  costToGoal = e.end.pathcost;
            }
            //    }


            for (int i = 0; i < arrayList.size(); i++) {

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
            System.out.println(explored.get(i).name);
        }
        System.out.println("seen nodes : " + (int) (explored.size() + frontier.size()));
        System.out.println("expanded nodes : " + explored.size());
        System.out.println("maximum memory used :" + (int) (explored.size() + frontier.size()));
        System.out.println("Path cost " + costToGoal);

    }

}




