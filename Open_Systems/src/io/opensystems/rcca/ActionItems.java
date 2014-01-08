package io.opensystems.rcca;

//import java.time.*;
//import java.util.Date;
import java.util.Vector;

/**
 * @author g145162
 *
 */
public class ActionItems {

	
protected	Vector<Task> actions;
private int startingIDIndex;	

public ActionItems(int actionIDIndex, int size){
	startingIDIndex =actionIDIndex;
	actions = new Vector<Task>(size);
}

public void add(String owner, String description, String due){
	String today="2014/1/5";	
	 Task e= new Task(startingIDIndex++, owner, description, today, due, "", Task.UNCOMPLETE); 
	actions.add(e);
	
}
public void add(String owner, String description, String start, String due, String end){
	 Task e= new Task(startingIDIndex++, owner, description, start, due, end, Task.UNCOMPLETE); 
	actions.add(e);

}
public void add(String owner, String description, String start, String due, String end, int status){
	 Task e= new Task(startingIDIndex++, owner, description, start, due, end, status); 
	actions.add(e);
}



public int size(){
	return actions.size();
}
public Task elementAt(int i){
	return actions.elementAt(i);
}
/**
 * Removes a task element at a given index
 * @param index
 */
public void remveAt(int index){
	actions.remove(index);
}
/**
 * Find task based on input ID and Removes it.
 * @param Task_ID
 * @return true if task was found and it was removed false otherwise
 */
public boolean remveTask(int Task_ID){
	return false;
}
}