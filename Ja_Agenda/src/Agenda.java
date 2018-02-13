import java.util.Calendar;

public class Agenda {
    private int año;
    private Pagina[] paginas;
    private Pagina abierta;

    public Agenda(int año) {
        this.año = año;

        if (esBisiesto(año)){
            paginas = new Pagina[366];
        }else{
            paginas = new Pagina[365];
        }
        int diasMes=30;
        int mes=1;
        int dia=1;
        for (Pagina a:this.paginas) {
            if (mes==1 || mes ==3 || mes==5 || mes==7 || mes==8 || mes ==10 || mes==12){
                diasMes=31;
            }else if(mes==2){
                if(esBisiesto(this.año)){
                    diasMes=29;
                }else {
                    diasMes=28;
                }
            }else if (mes==4 || mes ==6 || mes==9 || mes==11){
                diasMes=30;
            }
            for (dia = 1; dia <=diasMes; dia++) {
                a = new Pagina(dia, mes);
            }
            dia=1;
            mes++;
        }

    }

    public Agenda() {
        this( Calendar.getInstance().get((Calendar.YEAR)));
    }

    /**
     * Metodo que abre la agenda por un dia y mes indicados como parametros. La pagina abierta sera el atributo "abierta". Si no se encuentra la pagina, devolvera null.
     * @param dia
     * @param mes
     */
    public void abrirPagina(int dia, int mes){

        this.abierta = quePagina(dia, mes);
    }

    public Pagina getAbierta() {
        return abierta;
    }

    private boolean esBisiesto(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }


    private Pagina quePagina(int dia, int mes){
        for (Pagina a:this.paginas) {
           if (a.getDia()==dia && a.getMes()==mes){
               return a;
           }
        }
        return null;
    }
}
