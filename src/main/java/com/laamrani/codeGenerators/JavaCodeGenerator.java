package com.laamrani.codeGenerators;


import com.laamrani.classDiagram.ClassDiagram;

public class JavaCodeGenerator implements CodeGenerator {
    @Override
    public String fromClassDiagram(ClassDiagram classDiagram) {
        return "java impl";
    }
}
