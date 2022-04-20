package ar.edu.unju.fi.tp3_grupo22.ejercicio3;

public class Alumno {
    private String nombres;
    private String apellido;
    private int lu;
    private double[] notas;


    public Alumno() {
    }

    public Alumno(String nombres, String apellido, int lu, double[] notas) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.lu = lu;
        this.notas = notas;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLu() {
        return this.lu;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    /**
     * Método que calcula el promedio de las notas 
     * @return double
     */
    public double promedio(){
        double suma=0;
        for (int i = 0; i < notas.length; i++) {
            suma+=notas[i];
        }
        return suma/notas.length;
    }

    /**
     * Método que obtiene el valor máximo del arreglo de notas
     * @return double
     */
    public double notaMaxima(){
        double max = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (max<notas[i]) {
                max=notas[i];
            }
        }
        return max;
    }
}
