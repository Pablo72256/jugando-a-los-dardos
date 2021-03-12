public class Actividad0628 {
    public int jugandoALosDardos(double x, double y) {
        int puntos = 0;
        double hipotenusa = Math.sqrt(x*x + y*y);
        if (x == 0){
            hipotenusa = Math.sqrt(y * y);
        }
        if (y == 0){
            hipotenusa = Math.sqrt(x * x);
        }
        if (hipotenusa > 10){
            puntos = 0;
        }else if (hipotenusa > 5 && hipotenusa <= 10){
            puntos = 1;
        }else if (hipotenusa > 1 && hipotenusa <= 5){
            puntos = 5;
        }else{
            puntos = 10;
        }
        return puntos;
    }
}