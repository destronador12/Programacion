package Ejercicio8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Diccionario {
	public static void main(String[] args) {
	HashMap <String,String> diccionario = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	diccionario.put("Hola", "Hello");
	diccionario.put("Adios", "Bye");
	diccionario.put("Que", "What");
	diccionario.put("Como", "How");
	diccionario.put("Si", "Yes");
	
	System.out.println("¿Que palabra deseas traducir al ingles");
	String palabra = sc.nextLine();
	
	if(diccionario.containsKey(palabra)) {
		System.out.println("La traduccion es: "+diccionario.get(palabra));
	}else {
		System.out.println("La palabra no se encuentra en el diccionario");
	}
	
	HashMap<String,String> nuevoDiccionario = new HashMap<>();
	
	for(int i = 0; i<5;i++) {
		int posAleatoria = (int)(Math.random()*5);
	}
	
	}
}
