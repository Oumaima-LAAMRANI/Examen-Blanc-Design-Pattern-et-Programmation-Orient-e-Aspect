package com.laamrani.classDiagram.entities;


import com.laamrani.classDiagram.Value;

import java.util.ArrayList;
import java.util.List;

public class Enum extends Entity{
    private List<Value> values = new ArrayList<>();

    public Enum(List<Value> values) {
        this.values = values;
    }
}
