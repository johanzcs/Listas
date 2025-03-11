/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasdinamicas;


import java.util.ArrayList;
import java.util.Scanner;

public class ListaDinamica {
    private ArrayList<String> Lista;

    public ListaDinamica() {
        this.Lista = new ArrayList<>();
    }

    public void remove(int index) {
        if (index >= 0 && index < Lista.size()) {
            Lista.remove(index); 
            System.out.println("Posición " + index + " borrada.");
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public void clear() {
        Lista.clear(); 
        System.out.println("Lista borrada completamente.");
    }

    public void removeByData(String data) {
        if (Lista.remove(data)) {
            System.out.println("Elemento '" + data + "' borrado.");
        } else {
            System.out.println("Elemento '" + data + "' no encontrado.");
        }
    }

    public void size() {
        System.out.println("Tamaño de la lista: " + Lista.size());
    }

    public void set(int index, String data) {
        if (index >= 0 && index < Lista.size()) {
            Lista.set(index, data);
            System.out.println("Elemento en la posición " + index + " actualizado.");
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public void toArray() {
        Object[] array = Lista.toArray();
        System.out.println("Lista convertida a arreglo:");
        for (Object obj : array) {
            System.out.println(obj);
        }
    }

    public void get(int index) {
        if (index >= 0 && index < Lista.size()) {
            System.out.println("Elemento en la posición " + index + ": " + Lista.get(index));
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public void addAll(ArrayList<String> lista2) {
        Lista.addAll(lista2);
        System.out.println("Lista agregada con los elementos de la lista2.");
    }

    public void contains(String element) {
        if (Lista.contains(element)) {
            System.out.println("La lista contiene: " + element);
        } else {
            System.out.println("La lista no contiene: " + element);
        }
    }

    public void isEmpty() {
        if (Lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("La lista no está vacía.");
        }
    }

    public void sort() {
        Lista.sort(null);
        System.out.println("Lista ordenada alfabéticamente:");
        for (String item : Lista) {
            System.out.println(item);
        }
    }

    public void add(String element) {
        Lista.add(element);
        System.out.println("Elemento '" + element + "' agregado a la lista.");
    }

    public void mostrarCliente() {
        for (String dato : Lista) {
            System.out.println("Cliente: " + dato);
        }
    }
}
