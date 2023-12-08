package com.laamrani.diagramExporters;

import com.laamrani.classDiagram.ClassDiagram;

public class JSONExporter implements DiagramExporter {
    @Override
    public void export(ClassDiagram classDiagram) {
        System.out.println("JSON Export...");
    }
}
