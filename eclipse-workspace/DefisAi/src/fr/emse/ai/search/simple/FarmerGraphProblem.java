package fr.emse.ai.search.simple;

import java.util.ArrayList;
import java.util.Collection;

import fr.emse.ai.search.core.Problem;

public class FarmerGraphProblem implements Problem {
	
	SimpleState2 intitiationPb= new SimpleState2();
	SimpleState2 initialState = intitiationPb.getInitialState();
    SimpleState2 finalState = intitiationPb.getFinalState() ;

    @Override
    public Object getInitialState() {
        return initialState;
    }

    @Override
    public boolean isGoal(Object state) {
        return state.equals(finalState);
    }

    @Override
    public Collection<Object> getActions(Object state) {
        ArrayList<Object> actions = new ArrayList<Object>();
        boolean Louis = ((SimpleState2)state).getLouis();
        boolean Wolf = ((SimpleState2)state).getWolf();
        boolean Goat = ((SimpleState2)state).getGoat();
        boolean Cabbage = ((SimpleState2)state).getCabbage();        
        actions.add("L");
        if (Louis=Wolf) {
            actions.add("L with W");
        } else if (Louis=Goat) {
        	actions.add("L with G");
        } else if (Louis=Cabbage) {
        	actions.add("L with C");
        }
        return actions;
    }

    @Override
    public Object getNextState(Object state, Object action) {
        if (action.equals("L")) return ((SimpleState2)state).crossLouis();
        if (action.equals("L with W")) return ((SimpleState2)state).crossWolf();
        if (action.equals("L with G")) return ((SimpleState2)state).crossGoat();
        if (action.equals("L with C")) return ((SimpleState2)state).crossCabbage();
        return null;
    }

    @Override
    public double getStepCost(Object start, Object action, Object dest) {
        return 1;
    }
}
