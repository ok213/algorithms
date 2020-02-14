package main.tasks.collections;

import java.util.*;
import java.util.stream.Collectors;

// есть List<Entity>. Вернуть список детей. Они не должны повторяться

public class Task01 {

    public List<String> children;

    public static Collection<String> getChildren(List<Task01> list) {
        Set<String> set = new HashSet<>();
//        for (Task01 task01 : list) {
//            for (String name : task01.children) {
//                set.add(name);
//            }
//        }
//        return set;

        return list.stream()
                .flatMap(name -> name.children.stream())
                .distinct()
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Gena");
        list1.add("Ivan");
        List<String> list2 = new ArrayList<>();
        list2.add("Petya");
        list2.add("Ivan");
        List<String> list3 = new ArrayList<>();
        list3.add("Dima");
        list3.add("Petya");

        Task01 task011 = new Task01();
        task011.children = list1;
        Task01 task012 = new Task01();
        task012.children = list2;
        Task01 task013 = new Task01();
        task013.children = list3;

        List<Task01> task01List = new ArrayList<>();
        task01List.add(task011);
        task01List.add(task012);
        task01List.add(task013);
        task01List.add(task013);

        Collection<String> collection = getChildren(task01List);
        for (String children : collection) {
            System.out.println(children);
        }


    }
}
