
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
/*
 * POR ALGUNA RAZON NO SE PUEDE HACER QUE:
 * GraphAuxiliar pase a ser ExtendedGraph, heredando de Graph por composición.
 * La funcion connect al llamar a graph.AddEdge(...) da error en base a los argumentos
 * Se ha hecho lo mismo en el constructor de la clase ExtendedGraph y si funciona, debe haber algun error al llamar
 * a la funcion.
 */
public class TP1 {
        public static void main(String args[]) {
        		Ejercicio9();
        		//Ejemplo1();
        }
       
        protected static void ColorSet(Graph graph, String nodes, String color){
        	for(int i = 0; i< nodes.length(); i+=2){
        		graph.getNode( Character.toString(nodes.charAt(i)) ).addAttribute("ui.style","fill-color:"+ color +"; text-color:"+ color + ";");
        	}
        }
        protected static void Ejercicio9(){
        	Graph graph = new SingleGraph("Ejercicio de Prueba");
            graph.addAttribute("ui.stylesheet", GraphAuxiliar.STYLESHEET);
            
            graph.setStrict(false);
            graph.setAutoCreate(true);
            graph.display();
            GraphAuxiliar.ConnectMany(graph, "13,12,43,24,56,67,78");
            GraphAuxiliar.ColorSet(graph,"1,4,5,7","red");
            GraphAuxiliar.EnableLabels(graph);            
            
            /*
            SETS:
            14,45,57
            graph.addEdge("14", "1", "4");
            graph.addEdge("45", "4", "5");
            graph.addEdge("57", "5", "7");
  

            graph2.addEdge("23", "2", "3");
            graph2.addEdge("36", "3", "6");
            graph2.addEdge("68", "6", "8");
                  
            
            for (Node node : graph2) {
                node.addAttribute("ui.label", node.getId());
        
            }*/
        }
        protected static void Ejemplo1(){
        	  Graph graph = new SingleGraph("Ejercicio de Prueba");
              graph.addAttribute("ui.stylesheet", GraphAuxiliar.STYLESHEET);
              
              graph.setStrict(false);
              graph.setAutoCreate(true);
              graph.display();
              GraphAuxiliar.ConnectMany(graph,"21,24,32,36,62,65,61,46,43,51,45");
              GraphAuxiliar.EnableLabels(graph);         

        }
       
}

