public class pirmapamoka {
    public static void main(String[] args) {
        double a = 17.35;
        double b = 18;
        double c = 20.47;
        double d = 16.37;
        double e = 4;
        double f = 2;
        double g = 4.1;
        double h = 2;


        System.out.println("keturiuSienuPeremetras(a,b,c,d) = " + keturiuSienuPeremetras(a,b,c,d));
        System.out.println("keturiuSienuPeremetrasAntras(e,f,g,h) = " + keturiuSienuPeremetrasAntras(e,f,g,h));
    }
    public static double keturiuSienuPeremetras(double a, double b,double c,double d){
        return a + b + c + d;
    }
    public static double keturiuSienuPeremetrasAntras(double e, double f,double c,double h){
        return e + f + c + h;
    }
}
