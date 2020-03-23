package fr.emse.ai.search.simple;

import fr.emse.ai.search.solver.BreadthFirstTreeSearch;
import fr.emse.ai.search.solver.DepthFirstTreeSearch;

public class SimpleTest {

    public static void main(String[] args) {
        SimpleNonOrientedGraphProblem p1 = new SimpleNonOrientedGraphProblem();
        System.out.println("Solution to problem using depth first : ");
        System.out.println(new DepthFirstTreeSearch().solve(p1).pathToString());
        System.out.println("Solution to problem using breadth first : ");
        System.out.println(new BreadthFirstTreeSearch().solve(p1).pathToString());
    }
}
