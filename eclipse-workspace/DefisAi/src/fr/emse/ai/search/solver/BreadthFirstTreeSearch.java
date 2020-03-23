package fr.emse.ai.search.solver;
import java.util.Collection;
import java.util.LinkedList;

import fr.emse.ai.search.core.AbstractGraphSearch;
import fr.emse.ai.search.core.Node;
import fr.emse.ai.search.core.Problem;

public class BreadthFirstTreeSearch extends AbstractGraphSearch{
	 public Collection<Node> initFrontier() {
	        return new LinkedList<Node>();
	    }

	    public Node chooseLeafNode(Collection<Node> frontier, Problem problem) {
	        return ((LinkedList<Node>) frontier).pop();
	    }
}
