package com.weimin.annotation;

public class Main {
    public static void main(String[] args) {
        Class<Target> clazz = Target.class;
        if (clazz.isAnnotationPresent(WM.class)) {
            System.out.println("hello");
            WM annotation = clazz.getAnnotation(WM.class);
            System.out.println(annotation.value());
            System.out.println(annotation.age());
        }
    }
}
