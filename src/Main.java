public class Main {

    public static boolean stringaPariDispari(String input) {
        int lunghezza = input.length();
        return lunghezza % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String x = "sono";
        String y = "simpatico";
        int anno1 = 1993;
        int anno2 = 1992;

        System.out.println("La lunghezza di \"" + x + "\" è pari? " + stringaPariDispari(x));
        System.out.println("La lunghezza di \"" + y + "\" è pari? " + stringaPariDispari(y));
        System.out.println(anno1 + " è un anno bisestile? " + annoBisestile(anno1));
        System.out.println(anno2 + " è un anno bisestile? " + annoBisestile(anno2));
    }
}