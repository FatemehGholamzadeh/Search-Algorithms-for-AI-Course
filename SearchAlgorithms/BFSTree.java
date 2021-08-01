package SearchAlgorithms;

import ir.aut.Edge;
import ir.aut.Graph;
import ir.aut.Node;
import ir.aut.Problem;

import java.util.*;

public class BFSTree {


    LinkedList<Node> frontier;
   // ArrayList<Node> explored;

    public BFSTree() {
        frontier = new LinkedList<Node>() {
        };
  //      explored = new ArrayList<>();
    }


    public Node search(Graph graph) {

        frontier.add(graph.getStartNode());
        Node node ;

        boolean flag ;

        while (frontier.size() != 0) {
            node = frontier.poll();
            for (int i = 0; i < graph.nodes.size(); i++) {
                if (graph.nodes.get(i).name.equals(node.name))
                    node = graph.nodes.get(i);
            }
            System.out.println(node.name);
            if (node.equals(graph.getLastNode()))
                return node;
 //           explored.add(node);
            //  System.out.println(node.name);
            List<Edge> nodes = node.edgeList;
            ArrayList<Node> arrayList = new ArrayList();
            for (Edge e : nodes
                    ) {
                arrayList.add(e.end);
            }

            for (int i = 0; i < arrayList.size(); i++) {
                flag=true;
                Node node1 = arrayList.get(i);
                for (int j = 0; j < frontier.size(); j++) {
                    if (node1.name.equals(frontier.get(j).name)) {
                        flag = false;
                        break;
                    }
                }

//                for (int k = 0; k < explored.size(); k++) {
//
//                    if (node1.name.equals(explored.get(k).name)) {
//                        flag = false;
//                        break;
//                    }
//                }

                if (flag)
                    frontier.add(node1);
            }


        }

        return null;
    }

//    public void printPath(){
//        for (int i = 0; i <explored.size() ; i++) {
//            System.out.println(explored.get(i).name);
//        }
//    }
}


//
//
//
//
//    public BFSTree() {
//
//
//    }
//
//    void BFS(int s, Graph graph) {
//        // Mark all the vertices as not visited(By default
//        // set as false)
//        //      boolean visited[] = new boolean[graph.V];
//
//        // Create a queue for BFS
//        LinkedList<Integer> queue = new LinkedList<Integer>();
//
//        // Mark the current node as visited and enqueue it
//        //       visited[s] = true;
//        queue.add(s);
//
//        while (queue.size() != 0) {
//            // Dequeue a vertex from queue and print it
//            s = queue.poll();
//            System.out.print(s + " ");
//
//            // Get all adjacent vertices of the dequeued vertex s
//            // If a adjacent has not been visited, then mark it
//            // visited and enqueue it
//            Iterator<Integer> i = graph.adjListArray[s].listIterator();
//            while (i.hasNext()) {
//                int n = i.next();
//                //              if (!visited[n]) {
//                //                  visited[n] = true;
//                queue.add(n);
//                //               }
//            }
//        }
//    }