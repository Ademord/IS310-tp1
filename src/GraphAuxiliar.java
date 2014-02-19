import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;

public class GraphAuxiliar{
	 protected final static String STYLESHEET =
             "node {" +
             "   fill-color: black;" +
             "	text-size:30;" +
             "	text-background-mode: plain;" +
             "	text-padding:5;" +
             "}" +
             
             "graph {" +
             "	shadow-color: black;" +
             "  	shadow-mode: gradient-radial;" +
             
             "}" +
             "node.marked {" +
             "   fill-color: red;" +
             "}";
	 
	protected static void Connect(Graph graph, String args){
    	graph.addEdge(args, Character.toString(args.charAt(0)), Character.toString(args.charAt(1)));
    }
    protected static void ColorSet(Graph graph, String nodes, String color){
    	nodes+=",";
    	for(int i = 0; i< nodes.length(); i+=2){
    		graph.getNode( Character.toString(nodes.charAt(i)) ).addAttribute("ui.style","fill-color:"+ color +"; text-color:"+ color + ";");
    	}
    }
    protected static void ConnectMany(Graph graph, String args){
    	args+=",";
    	for(int i = 0; i< args.length(); i+=3){
    		Connect(graph,args.substring(i,i+2));
    	}
    }
    protected static void EnableLabels(Graph graph){
    	for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        }
    }
}
