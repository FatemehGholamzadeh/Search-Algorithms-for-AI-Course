package SearchAlgorithms;

import ir.aut.Edge;
import ir.aut.Graph;
import ir.aut.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static ir.aut.Problem.getActions;
import static ir.aut.Problem.getInitialState;
import static ir.aut.Problem.goalTest;

public class DLS {


    public int limit;
    ArrayList<Node> explored;
    Stack<Node> frontier;

    public DLS(int limit) {
        explored = new ArrayList<Node>();
        frontier = new Stack<Node>();
        this.limit = limit;
    }

    public void search(Graph graph) {

        frontier.push(getInitialState(graph));
        boolean flag;
        int depth = 0;


        while (frontier.size() != 0) {
            if (depth <= limit) {

                Node node = frontier.pop();
                for (int i = 0; i < graph.nodes.size(); i++) {
                    if (graph.nodes.get(i).name.equals(node.name))
                        node = graph.nodes.get(i);
                }

                System.out.println(node.name);

                if (goalTest(node))
                    return;
                explored.add(node);

                List<Edge> nodes = getActions(node);
                ArrayList<Node> arrayList = new ArrayList();
                for (Edge e : nodes
                        ) {
                    arrayList.add(e.end);
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
                depth++;
            } else {
                System.out.println("can't find goal");
                return;
            }


        }


    }

    public void printPath() {
//        System.out.println("path is : ");
//        for (int i = 0; i < explored.size(); i++) {
//            System.out.println(explored.get(i).name );
//        }
        System.out.println("seen nodes : " + (int)(explored.size()+frontier.size()));
        System.out.println("expanded nodes : " +explored.size() );
        System.out.println("maximum memory used :" + (int)(explored.size()+frontier.size()));
        System.out.println("Path cost " + explored.size());

    }

} 