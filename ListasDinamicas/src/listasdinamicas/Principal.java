/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdinamicas;

import java.util.ArrayList;


public class Principal {
     public static void main(String[] args) {
        ListaDinamica listaDinamica = new ListaDinamica();

        listaDinamica.add("Alma morada");
        listaDinamica.add("Carlos");
        listaDinamica.add("Ana");

        System.out.println("Lista inicial:");
        listaDinamica.mostrarCliente();

        listaDinamica.remove(1);
        listaDinamica.mostrarCliente();
        
        listaDinamica.clear();
        listaDinamica.mostrarCliente();

        listaDinamica.add("Juan");
        listaDinamica.add("Luis");
        listaDinamica.add("Maria");

        listaDinamica.size();

        listaDinamica.set(1, "Pedro");
        listaDinamica.mostrarCliente();

        listaDinamica.toArray();

        listaDinamica.get(1);

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Emma");
        lista2.add("Javier");
        listaDinamica.addAll(lista2);
        listaDinamica.mostrarCliente();

        listaDinamica.contains("Emma");

        listaDinamica.isEmpty();

        listaDinamica.sort();
    }
}
