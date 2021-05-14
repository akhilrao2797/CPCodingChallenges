package com.cp.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupPeopleGivenGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] g) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<g.length; i++){
            if(map.containsKey(g[i]))
                map.get(g[i]).add(i);
            else
            {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(g[i], l);
            }
        }

        List<List<Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer, List<Integer>> e: map.entrySet()){
            int i=0;
            int k = e.getValue().size();
            while(i<k){
                list.add(e.getValue().subList(i, i+ e.getKey()));
                i+=e.getKey();
            }
        }
        return list;
    }
}
