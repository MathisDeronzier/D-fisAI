package fr.emse.ai.search.simple;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleState2{
	public boolean Louis;
	public boolean Wolf;
	public boolean Goat;
	public boolean Cabbage;

public  SimpleState2(){
	this.Louis=false;
	this.Wolf=false;
	this.Goat=false;
	this.Cabbage=false;
}
public SimpleState2(boolean a, boolean b, boolean c, boolean d) {
	this.Louis=a;
	this.Wolf=b;
	this.Goat=c;
	this.Cabbage=d;
}

public SimpleState2 getInitialState() {
	return new SimpleState2(false,false,false,false);
}
public SimpleState2 getFinalState() {
	return new SimpleState2(true,true,true,true);
}
public boolean getLouis() {
	return (this.Louis);
}
public boolean getWolf() {
	return (this.Wolf);
}
public boolean getGoat() {
	return (this.Goat);
}
public boolean getCabbage() {
	return (this.Cabbage);
}
public SimpleState2 crossLouis() {
	return new SimpleState2(!this.Louis,this.Wolf, this.Goat, this.Cabbage);
}
public SimpleState2 crossWolf() {
	return new SimpleState2(!this.Louis,!this.Wolf, this.Goat, this.Cabbage);
}
public SimpleState2 crossGoat() {
	return new SimpleState2(!this.Louis,this.Wolf, !this.Goat, this.Cabbage);
}
public SimpleState2 crossCabbage() {
	return new SimpleState2(!this.Louis,this.Wolf, this.Goat, !this.Cabbage);
}
public Collection<Object> getStates(SimpleState2 s){
	ArrayList<Object> actions= new ArrayList<Object>();
	actions.add(s.crossLouis());
	if (s.Louis=s.Wolf) {
		actions.add(s.crossWolf());
	} if (s.Louis=s.Wolf) {
			actions.add(s.crossWolf());
	} if (s.Louis=s.Wolf) {
		actions.add(s.crossWolf());
	}
	return actions;
}
}

