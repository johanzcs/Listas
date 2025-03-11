/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdinamicas;

import java.util.ArrayList;


public class Metodos {
    public static void main(String[] args) {
        ListaDinamica listaDinamica = new ListaDinamica();

        // Agregar algunos elementos iniciales
        listaDinamica.add("Alma morada");
        listaDinamica.add("Carlos");
        listaDinamica.add("Ana");

        System.out.println("Lista inicial:");
        listaDinamica.mostrarCliente();

        // Eliminar un elemento por índice
        listaDinamica.remove(1);
        listaDinamica.mostrarCliente();

        // Borrar todo
        listaDinamica.clear();
        listaDinamica.mostrarCliente();

        // Volver a agregar elementos
        listaDinamica.add("Juan");
        listaDinamica.add("Luis");
        listaDinamica.add("Maria");

        // Ver el tamaño de la lista
        listaDinamica.size();

        // Cambiar un valor en un índice
        listaDinamica.set(1, "Pedro");
        listaDinamica.mostrarCliente();

        // Convertir la lista en un arreglo
        listaDinamica.toArray();

        // Obtener un valor por índice
        listaDinamica.get(1);

        // Agregar una lista adicional
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Emma");
        lista2.add("Javier");
        listaDinamica.addAll(lista2);
        listaDinamica.mostrarCliente();

        // Verificar si contiene un elemento
        listaDinamica.contains("Emma");

        // Verificar si la lista está vacía
        listaDinamica.isEmpty();

        // Ordenar la lista
        listaDinamica.sort();
    }
}


