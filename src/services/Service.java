package services;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Service {
    private LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap();
    public void addToLinkedHashMap(Integer index, String value){
        linkedHashMap.put(index, value);
        System.out.println("Add new value to list \"" + value + "\" with key code <" + index + ">");
    }
    public void transferValueToLinkedHashSet(){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < linkedHashMap.size(); i++){
            linkedHashSet.add(linkedHashMap.get(i));
        }
        System.out.println(linkedHashSet.stream().collect(Collectors.toList()));
    }

    public void transferKeysToLinkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer element:linkedHashMap.keySet()) {
            list.add(element);
        }
        System.out.println(list.stream().collect(Collectors.toList()));
    }
}
