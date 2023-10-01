/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author LAPTOP DELL
 */
public class Menu {

    // declare
    Scanner sc = new Scanner(System.in);
    InputValidation iv = new InputValidation();

    // Main Menu
    public int mainMenu() {
        // declare
        int option;

        System.out.println("--- EQUATION PROGRAM ---");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Your choice: ");
        option = iv.validateMenuOption(1, 3);

        return option;
    }

}