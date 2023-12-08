package com.laamrani.diagramExporters;

import com.laamrani.classDiagram.ClassDiagram;

public class SVGExporter implements DiagramExporter {
    @Override
    public void export(ClassDiagram classDiagram) {
        System.out.println("SVG Export...");
    }
}
