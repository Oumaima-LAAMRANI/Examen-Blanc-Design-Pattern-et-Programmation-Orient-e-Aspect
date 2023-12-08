package com.laamrani.diagramExporters;

import com.laamrani.classDiagram.ClassDiagram;

public class XMLExporter implements DiagramExporter {
    @Override
    public void export(ClassDiagram classDiagram) {
        System.out.println("XML Export...");
    }
}
