package model;

import java.util.ArrayList;

public class Escuela {
    private  String nombre;
    private ArrayList<Estudiante> listEstudiantes;

    public Escuela(String nombre) {
        this.nombre = nombre;
        listEstudiantes= new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {

        listEstudiantes.add(estudiante);



    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(ArrayList<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    public void removerEstudiante(Estudiante estudiante) {

        listEstudiantes.remove(estudiante);

    }
}
