package se.thinkcode.ctd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TodoList {
    Map<String, List<String>> tasks = new HashMap<>();

    public void addTask(String owner, String task) {
        List<String> currentTasks = tasks.getOrDefault(owner, new ArrayList<>());
        currentTasks.add(task);
        tasks.put(owner, currentTasks);
    }

    public List<String> getTasks(String owner) {
        return tasks.get(owner);
    }
}
