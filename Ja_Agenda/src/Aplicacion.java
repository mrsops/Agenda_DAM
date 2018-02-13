import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        String opcion="";
        Agenda agenda;


        do{
            switch (opcion){
                case "1":
                    System.out.print("Introduce el año: ");
                    int año = tc.nextInt();
                    agenda=new Agenda(año);

                case "2":

                case "3":


                case "4":

                case "5":

                case "0":
            }


        }while (opcion.equals("0"));

    }

    public static void menu(){
        System.out.println("1. Crear una nueva Agenda.");
        System.out.println("2. Añadir cita.");
        System.out.println("3. Borrar cita.");
        System.out.println("4. Buscar cita.");
        System.out.println("5. Modificar cita.");
        System.out.println("0. Salir del programa.");
    }

    private static void limpiapantalla(){
        for (int i = 0; i <50 ; i++) {
            System.out.println("");
        }
    }
}
