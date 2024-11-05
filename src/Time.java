public class Time {
    private int hora, minuto, segundo;

    void setTime(int h, int m, int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    void setTime(int h, int m){
        this.hora = h;
        this.minuto = m;
    }

    void setTime(int h){
        this.hora = h;
    }

    String exibirHoraUniversal(){
        int horaUniversal;

        if(hora < 24){
            horaUniversal = hora;
        }else{
            horaUniversal = 0;
        }

        return formatarHorario(horaUniversal) + ":" + formatarHorario(minuto) + ":" + formatarHorario(segundo);
    }

    String exibirHoraPadrao(){
        int horaPadrao;
        String sufixo;

        if(hora > 11 && hora < 24){
            sufixo = "PM";

            if(hora == 12){
                horaPadrao = hora;
            }else{
                horaPadrao = hora - 12;
            }
        }else{
            sufixo = "AM";

            if(hora == 24){
                horaPadrao = hora - 12;
            }else{
                horaPadrao = hora;
            }
        }

        return formatarHorario(horaPadrao) + ":" + formatarHorario(minuto) + ":" + formatarHorario(segundo) + " " + sufixo;
    }

    private String formatarHorario(int n){
        if(n < 10){
            return "0" + n;
        }

        return String.valueOf(n);
    }
}