package com.mycompany.heartstoneclient.ui;

import com.mycompany.heartstoneclient.entitys.Handler;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Scanner sc;
    Handler handler;

    public Menu() {

        switch (readNumber()) {
            case 1:
                listMenu();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;

        }

    }
    
    public final void listMenu(){
    
    switch(readNumber()){
        case 1:
            handler.getHttpGetter().javaObject().getBasic();
            break;
        case 2:
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;
    }
    }
    
    
    

    public final String readText() {

        sc = new Scanner(System.in);
        boolean wrongInput = true;
        String text = "";

        while (wrongInput) {
            try {
                text = sc.nextLine();
                wrongInput = false;
            } catch (InputMismatchException e) {

                System.out.println("Ops wrong input try again");

            }
        }
        return text;

    }

    public final int readNumber() {

        sc = new Scanner(System.in);
        boolean wrongInput = true;
        int number = 0;
        while (wrongInput) {
            try {
                number = sc.nextInt();
                sc.nextLine();
                wrongInput = false;
                
            } catch (InputMismatchException e) {
                System.out.println("Ops wrong input, try again!");
                sc.nextLine();
            }
        }
        return number;
    }

}
