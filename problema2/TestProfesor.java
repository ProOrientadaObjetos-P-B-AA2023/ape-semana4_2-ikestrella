class Profesor{
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    private Provincia provincia;

    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula,Provincia provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        this.provincia=provincia;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void calcularSueldoTotal(){
        this.sueldoTotal=sueldoBasico+(this.sueldoBasico*0.20);
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String toString(){
        return String.format("DATOS"+
                "\nNombre: %s"+
                "\nApellido: %s"+
                "\nProvincia: %s"+
                "\nSueldo Basico: %.2f"+
                "\nSueldo Total: %.2f"+
                "\nCedula: %s",this.nombre,this.apellido,this.provincia,this.sueldoBasico,this.sueldoTotal,this.cedula);
    }
}

class Provincia{
    private String nombre;
    private int habitantes;

    public Provincia(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String toString(){
        return String.format("%s"+
                "\nNumero Habitantes: %d", this.getNombre(),this.getHabitantes());
    }
}
public class TestProfesor {
    public static void main(String[] args) {
        Provincia provincia=new Provincia("Loja",449000);
        Profesor profesor= new Profesor("Iam","Estrella",5000,"1104599376",provincia);
        profesor.calcularSueldoTotal();
        System.out.println(profesor);
    }
}
