package org.example;

import org.example.config.appconfig;
import org.example.controller.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
         try ( AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(appconfig.class)) {

             controller cs = context.getBean(controller.class);
             cs.createuser("Prince");
             cs.listuser();
         }}

    }