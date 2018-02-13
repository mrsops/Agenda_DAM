import java.util.ArrayList;
import java.util.Scanner;

public class Pagina {
    private Scanner tc = new Scanner(System.in);
    private int dia;
    private int mes;
    private ArrayList<Cita> citas = new ArrayList();

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public void añadirCita(Cita c){
    this.citas.add(c);
    listarCitas();
}

    public void borrarCita(int id){
        this.citas.remove(id);
        listarCitas();
    }

    public void modificarCita(int id){
        this.citas.set(id,this.crearCita());
        listarCitas();
    }

    public Cita buscarCita(String titulo){
        for (Cita a:this.citas) {
            if (a.getTitulo().equals(titulo)){
                return a;
            }
        }
        System.out.println("No existe ninguna cita con ese titulo.");
        return null;
    }

    private void listarCitas(){
        System.out.println(toString());

    }

    private Cita crearCita(){
        System.out.print("Introduce el titulo: ");
        String titulo = tc.nextLine();
        System.out.print("Introduce la hora nueva: ");
        int hora = tc.nextInt();
        tc.nextLine();
        System.out.print("Introduce los minutos: ");
        int minutos = tc.nextInt();
        tc.nextLine();
        System.out.print("Descripcion de la cita: ");
        String texto = tc.nextLine();
        return new Cita(hora, minutos, titulo, texto);
    }

    public String toString(){
        int id = 0;
        String texto="";
        for (Cita a:this.citas) {
            texto +="ID: "+id+" Titulo: "+a.getTitulo()+". Hora: "+a.getHora()+":"+a.getMinutos()+" Descripcion: "+a.getTexto()+"\n";
            id++;
        }
        return texto;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}
