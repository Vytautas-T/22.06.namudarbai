import java.util.Scanner;

public class uzduotis {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        double a = skaitytuvas.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double b = skaitytuvas.nextDouble();
        System.out.println("Iveskite trecia skaiciu");
        double c = skaitytuvas.nextDouble();
        double p = apskaiciavimas(a,b,c);
        System.out.println("Pusperimetris = " + p);
        System.out.println("Trikampio plotas = " + suHerono(a,b,c,p));;
    }
    public static double apskaiciavimas (double a,double b,double c) {
        return a + b + c;
    }
    public static double suHerono (double a, double b, double c,double p) {
        p = p / 2;
        double h = p - a;
        double j = p - b;
        double k = p - c;
        double s = p * h * j * k;
        return Math.sqrt(s);
    }


}
