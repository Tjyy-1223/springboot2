package com.tjyy.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        try {
            Class<?> clazz = Class.forName("com.itheima.ebean.Mouse");
            if(clazz != null) {
                return new String[]{"com.itheima.bean.Cat"};
            }
        } catch (ClassNotFoundException e) {
            return new String[0];
        }
        return null;
    }
}
