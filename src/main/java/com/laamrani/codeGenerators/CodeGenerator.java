package com.laamrani.codeGenerators;


import com.laamrani.classDiagram.ClassDiagram;

public interface CodeGenerator {
    String fromClassDiagram(ClassDiagram classDiagram);
}
