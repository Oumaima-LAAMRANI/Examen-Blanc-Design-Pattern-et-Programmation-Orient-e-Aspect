package com.laamrani.classDiagram;


import com.laamrani.attributObserver.Observable;
import com.laamrani.attributObserver.Observer;

import java.util.List;

public class Attribut implements Observable {
    private String name;
    private String type;
    private boolean isStatic;
    private boolean isFinal;
    private Visibility visibility;
    private List<Observer> observers;

    @Override
    public void notifyObserver() {

    }
}
