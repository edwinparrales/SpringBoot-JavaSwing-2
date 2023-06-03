/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.demo;

import co.demo.vista.MainMDI;
import java.awt.EventQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author usuario
 */
@Component
public class SpringBootSwingCommandLineRunner implements CommandLineRunner {

    private final MainMDI controller;

    @Autowired
    public SpringBootSwingCommandLineRunner(MainMDI controller) {
        this.controller = controller;
    }

    @Override
    public void run(String... args) {
        //This boots up the GUI.

        EventQueue.invokeLater(() -> {

            controller.setVisible(true);

        });
    }

}
