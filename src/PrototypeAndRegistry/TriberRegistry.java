package PrototypeAndRegistry;

import java.util.*;

public class TriberRegistry {
    Map<String,Triber> triberRegistry = new HashMap<>();

    public void register(String data,Triber triber) {
        triberRegistry.put(data,triber);
    }

    public Triber getObject(String data) {
        return triberRegistry.get(data);
    }

}
