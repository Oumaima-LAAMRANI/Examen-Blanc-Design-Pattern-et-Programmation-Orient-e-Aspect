package com.laamrani.diagramExporters;


import com.laamrani.classDiagram.ClassDiagram;

public class BinaryExporter implements DiagramExporter {
    @Override
    public void export(ClassDiagram classDiagram) {
        System.out.println("Binary Export...");
    }
}
