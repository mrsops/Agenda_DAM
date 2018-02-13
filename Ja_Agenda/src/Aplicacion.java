import java.util.Scanner;

public class Aplicacion {
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        int id;
        String opcion="";
        Agenda agenda=new Agenda();



        do{
            menu();
            opcion = tc.nextLine();
            switch (opcion){
                case "1":
                    System.out.print("Introduce el año: ");
                    int año = tc.nextInt();
                    agenda=new Agenda(año);
                    tc.nextLine();
                    limpiapantalla();
                    break;
                case "2":
                    limpiapantalla();
                    System.out.print("Introduce el mes: ");
                    int mes = tc.nextInt();
                    tc.nextLine();
                    System.out.print("Introduce el dia: ");
                    int dia = tc.nextInt();
                    tc.nextLine();
                    limpiapantalla();
                    agenda.abrirPagina(dia, mes);
                    break;
                case "3":
                    limpiapantalla();
                    agenda.getAbierta().añadirCita(crearCita());
                    break;
                case "4":
                    limpiapantalla();
                    System.out.println(agenda.getAbierta());
                    System.out.println("");
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    System.out.print("Introduce el id de la cita a borrar: ");
                    id = tc.nextInt();
                    tc.nextLine();
                    agenda.getAbierta().borrarCita(id);
                    break;
                case "5":
                    limpiapantalla();
                    System.out.print("Introduce el titulo de la cita a buscar: ");
                    String titulo = tc.nextLine();
                    limpiapantalla();
                    System.out.println(agenda.getAbierta().buscarCita(titulo));
                    break;
                case "6":
                    System.out.println(agenda.getAbierta());
                    System.out.println("");
                    System.out.println("----------------------------------------------");
                    System.out.println("");
                    System.out.println("Introduce el id de la cita a modificar: ");
                    id = tc.nextInt();
                    limpiapantalla();
                    agenda.getAbierta().modificarCita(id);

                    break;
                case "0":
                    System.out.println("Cerrando Agenda: ");
                    break;
            }


        }while (!opcion.equals("0"));

    }

    public static void menu(){
        System.out.println("1. Crear una nueva Agenda.");
        System.out.println("2. Abrir pagina.");
        System.out.println("3. Añadir cita.");
        System.out.println("4. Borrar cita.");
        System.out.println("5. Buscar cita.");
        System.out.println("6. Modificar cita.");
        System.out.println("0. Salir del programa.");
        System.out.print(">| : ");
    }

    public static Cita crearCita(){
        System.out.print("Introduce un titulo: ");
        String titulo = tc.nextLine();
        System.out.print("Introduce una hora: ");
        int hora = tc.nextInt();
        tc.nextLine();
        System.out.print("Introduce los minutos: ");
        int minutos = tc.nextInt();
        tc.nextLine();
        System.out.print("Introduce un texto descriptivo: ");
        String texto = tc.nextLine();
        return new Cita(hora,minutos,titulo,texto);
    }


    private static void limpiapantalla(){
        for (int i = 0; i <50 ; i++) {
            System.out.println("");
        }
    }
}
