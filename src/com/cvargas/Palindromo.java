package com.cvargas;

import java.util.*;

import java.util.concurrent.ArrayBlockingQueue;

public class Palindromo{


    public static void main(String[] args) {
        String cadena = "2002";
        ArrayDeque <Character> pila = new ArrayDeque<>();
        boolean esPalindromo = true;

        for (int i = 0; i < cadena.length(); i++){
            pila.push(cadena.charAt(i));
        }

        for (int j = 0; j < cadena.length(); j++){
            cadena.charAt(j);

            if (cadena.charAt(j)==pila.pop()){
                continue;
            }else {
                esPalindromo = false;
                break;

            }
        }//else
        String mensaje = esPalindromo? "si es palindromo" : "no es palindromo";
            System.out.println(cadena);
                System.out.println(mensaje);
        }

    }

