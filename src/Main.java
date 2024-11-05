public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        time.setTime(24, 59, 59);

        System.out.println(time.exibirHoraUniversal());
        System.out.println(time.exibirHoraPadrao());
    }
}
